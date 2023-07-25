package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	//metodo
	
	String obterDataFormatada() {
		return String.format("%d/ %d/ %d" , dia, mes, ano);
	}

}
