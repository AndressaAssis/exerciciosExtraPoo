package Aula6;

import Aula6.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Andressa", 4000, 100 * 1.11, 100 * 1.06);
		
		
		System.out.println("Nome: " + funcionario.getNome() + "\nSalário : " + funcionario.getSalario() + "\nINSS: " + funcionario.getINSS() + "\nVale Transporte: " + funcionario.getValeTransporte() + "\nSalário Liquído: " + funcionario.calcularDesconto());
	}

}
