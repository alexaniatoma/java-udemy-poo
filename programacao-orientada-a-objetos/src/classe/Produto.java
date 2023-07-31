package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.50;
	
	
	//Construtor padrão
	Produto() {
		
	}
	
	//Construtor explicito
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	//metodo
	double precoComDesconto() {
		double resultado = preco * (1 - desconto);
		return resultado;
	}

}
