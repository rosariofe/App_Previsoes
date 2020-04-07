package br.usjt.appprevisoes.model;

public class PrevisaoDoTempo {
	private String nomedodia;
	private Double tempminima;
	private Double tempmaxima;
	private Double umidade;
	private String descricao;
	
	public String getNomedodia() {
		return nomedodia;
	}
	public void setNomedodia(String nomedodia) {
		this.nomedodia = nomedodia;
	}
	public Double getTempminima() {
		return tempminima;
	}
	public void setTempminima(Double tempminima) {
		this.tempminima = tempminima;
	}
	public Double getTempmaxima() {
		return tempmaxima;
	}
	public void setTempmaxima(Double tempmaxima) {
		this.tempmaxima = tempmaxima;
	}
	public Double getUmidade() {
		return umidade;
	}
	public void setUmidade(Double umidade) {
		this.umidade = umidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
