package Aula6;

public class Veiculo {
	String placa;
	String tipo;
	int valor;
	double IPVA = 100;
	
	
	public double getIPVA() {
		return IPVA;
	}


	public void setIPVA(double iPVA) {
		IPVA = iPVA;
	}


	public String getPlaca() {
		return placa;
	}


	public String getTipo() {
		return tipo;
	}


	public int getValor() {
		return valor;
	}
	
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}
	

}
