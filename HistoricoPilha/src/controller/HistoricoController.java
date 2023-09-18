package controller;

import java.util.regex.Pattern;

import model.PilhaString;

	public class HistoricoController {
	    private static final Pattern URL_PATTERN = Pattern.compile("^http://www\\..+\\..+$");

	    public static void inserirEndereco(PilhaString historico, String endereco) {
	        if (isValidURL(endereco)) {
	            historico.push(endereco);
	            System.out.println("Endereço adicionado ao histórico: " + endereco);
	        } else {
	            System.out.println("Erro: Endereço inválido.");
	        }
	    }

	    public static void removerUltimoEndereco(PilhaString historico) throws Exception {
	        if (!historico.isEmpty()) {
	            historico.pop();
	            System.out.println("Último endereço removido do histórico.");
	        } else {
	            System.out.println("Erro: Histórico vazio, não é possível remover.");
	        }
	    }

	    public static String consultarUltimoEndereco(PilhaString historico) throws Exception {
	        if (!historico.isEmpty()) {
	            String ultimoEndereco = historico.top();
	            System.out.println("Último endereço consultado: " + ultimoEndereco);
	            return ultimoEndereco;
	        } else {
	            System.out.println("Erro: Histórico vazio, não é possível consultar.");
	            return null;
	        }
	    }

	    private static boolean isValidURL(String endereco) {
	        return URL_PATTERN.matcher(endereco).matches();
	    }
	}

