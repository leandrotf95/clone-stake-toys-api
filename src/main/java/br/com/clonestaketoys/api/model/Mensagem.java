package br.com.clonestaketoys.api.model;

public class Mensagem {

	private String mensagem;
	private int statusCode;
	
	public Mensagem(String mensagem, int statusCode) {
		this.mensagem = mensagem;
		this.statusCode = statusCode;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}
