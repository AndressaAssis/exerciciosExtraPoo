package Aula7;

public class MainProduto {

	public static void main(String[] args) {
		Produto p = new Produto (1, "Arroz", 20, 2);
		
		System.out.println("CODIGO: " + p.getCod() + "\nPRODUTO: " + p.getDescricao() + "\nVALOR " + p.getValor() + 
		"\nQUANTIDADE: " + p.getQuantidade() + "\nTOTAL: " + p.getValorTotal(0) + "\nICMS: " + p.calcularIcms());
		
		
	}
 
}
