package Aula6;

public class Funcionario {

	private String nome;
	private double salario;
	private double INSS = 11;
	private double valeTransporte = 6;
	double salarioLiquido;
	
	
	public double calcularDesconto() {
		return salarioLiquido = salario - INSS * valeTransporte/100;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getINSS() {
		return INSS;
	}
	
	public double getValeTransporte() {
		return valeTransporte;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setINSS(double iNSS) {
		INSS = iNSS;
	}
	
	public void setValeTransporte(double valeTransporte) {
		this.valeTransporte = valeTransporte;
	}

	public Funcionario(String nome, double salario, double INSS, double valeTransporte) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.INSS = INSS;
		this.valeTransporte = valeTransporte;
	}
	
	//
	

}
