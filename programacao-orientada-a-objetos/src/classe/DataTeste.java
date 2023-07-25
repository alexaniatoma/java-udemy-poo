package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data niverAle = new Data();
		niverAle.dia = 30;
		niverAle.mes = 12;
		niverAle.ano = 1984;
		
		System.out.println("Data aniversário Alexania " + niverAle.obterDataFormatada());
		
		
		Data niverCelso = new Data();
		niverCelso.dia = 02;
		niverCelso.mes = 8;
		niverCelso.ano = 1965;
		
		System.out.printf("Data aniversário Celso " + niverCelso.obterDataFormatada());
		
		
	}
	
}
