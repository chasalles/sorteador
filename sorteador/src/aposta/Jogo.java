package aposta;

import java.util.LinkedList;

public class Jogo {
	private Integer concurso;
	private String data;
	private LinkedList<Integer> apostaNumeros;

	public Jogo(String concurso, String data) {
		super();
		this.concurso = Integer.valueOf(concurso);
		this.data = data;
		this.apostaNumeros = new LinkedList<Integer>();
	}

	public void adicionaNumero(String numero) {
		this.apostaNumeros.add(Integer.valueOf(numero));
	}

	public LinkedList<Integer> getApostaNumeros() {
		return apostaNumeros;
	}

	public void setApostaNumeros(LinkedList<Integer> apostaNumeros) {
		this.apostaNumeros = apostaNumeros;
	}
}
