package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public class Artigo extends Conteudo{
	
	private Set<String> referencias = new HashSet<>();

	@Override
	public double calcularXp() {
		return XP_PADRAO + 30d;
	}
	
	public void addReferencia(String referencia) {
		referencias.add(referencia);
	}
	
	public Set<String> getReferencias(){
		return this.referencias;
	}

}
