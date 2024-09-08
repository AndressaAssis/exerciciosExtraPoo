package Aula6;

public class MainVeiculo extends Veiculo {
	
	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		Veiculo veiculo2 = new Veiculo();
		
		veiculo.setPlaca("LDA-259H3");
		veiculo.setTipo("Gás");
		veiculo.setValor(58000);
		veiculo.setIPVA(100 * 1.01);
		
		veiculo2.setPlaca("KYZ-1080");
		veiculo2.setTipo("Flex");
		veiculo2.setValor(40600);
		veiculo2.setIPVA(100 * 1.04);
	
		System.out.println("CARRO 1: \nPlaca: " + veiculo.getPlaca() + " -  Tipo de combústivel: " + veiculo.getTipo() + " - Valor do veiculo: " + veiculo.getValor() + " - Valor do IPVA: " + veiculo.getIPVA());
		System.out.println("CARRO 1: \nPlaca: " + veiculo2.getPlaca() + " -  Tipo de combústivel: " + veiculo2.getTipo() + " - Valor do veiculo: " + veiculo2.getValor() + " - Valor do IPVA: " + veiculo2.getIPVA());
	}
}
