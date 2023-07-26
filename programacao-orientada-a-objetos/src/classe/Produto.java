package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	
	//Construtor padrão
	Produto() {
		
	}
	
	//Construtor explicito
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	//metodo
	double precoComDesconto() {
		double resultado = preco * (1 - desconto);
		return resultado;
	}

}
