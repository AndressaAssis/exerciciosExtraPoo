package Aula7;

public class Produto {
	private int cod;
	private String descricao;
	private int valor;
	private int quantidade;
	private double valorTotal;
	private double ICMS;
	
	public Produto(int cod, String descricao, int valor, int quantidade) {
		super();
		this.cod = cod;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValorTotal(double valorTotal) {
		valorTotal = valor * quantidade;
		return valorTotal;
	}

	public double calcularIcms () {
		valorTotal = getValorTotal(valorTotal);
		ICMS = valorTotal * 0.12;
		return ICMS;
		}

}
