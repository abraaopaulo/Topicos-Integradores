package br.com.rpg_de_texto.leitor;

public class Botao {
	
	private String texto;
	private String prximaTela;
	private String vida;
	private String esperiencia;
	private String poder;
	private String respeito;
	private String inventario;
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getPrximaTela() {
		return prximaTela;
	}
	public void setPrximaTela(String prximaTela) {
		this.prximaTela = prximaTela;
	}
	public int getVida() {
		return Integer.parseInt(vida);
	}
	public void setVida(String vida) {
		this.vida = vida;
	}
	public int getEsperiencia() {
		return Integer.parseInt(esperiencia);
	}
	public void setEsperiencia(String esperiencia) {
		this.esperiencia = esperiencia;
	}
	public int getPoder() {
		return Integer.parseInt(poder);
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}
	public int getRespeito() {
		return Integer.parseInt(respeito);
	}
	public void setRespeito(String respeito) {
		this.respeito = respeito;
	}
	public String getInventario() {
		return inventario;
	}
	public void setInventario(String inventario) {
		this.inventario = inventario;
	}	
	
}
