package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	//metodo
	double precoComDesconto() {
		double resultado = preco * (1 - desconto);
		return resultado;
	}

}
