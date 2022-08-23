package aposta;

import java.util.Iterator;
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
	
	public Integer getConcurso() {
		return concurso;
	}

	public void setConcurso(Integer concurso) {
		this.concurso = concurso;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public LinkedList<Integer> getApostaNumeros() {
		return apostaNumeros;
	}

	public void setApostaNumeros(LinkedList<Integer> apostaNumeros) {
		this.apostaNumeros = apostaNumeros;
	}
	
	public boolean isIgual(LinkedList<Integer> apostaNumeros) {
		for (int i = 0; i < this.apostaNumeros.size(); i++) {
			if(this.apostaNumeros.get(i) != apostaNumeros.get(i)) {
				return false;
			}
		}
		
		return true;
	}
}
