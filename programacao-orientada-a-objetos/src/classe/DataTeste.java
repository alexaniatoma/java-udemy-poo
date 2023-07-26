package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data data1 = new Data(30, 12, 1984);
		System.out.println("Data aniversário Alexania " + data1.obterDataFormatada());
		
		
		Data data2 = new Data();
		System.out.printf("Data aniversário Celso " + data2.obterDataFormatada());
		
		
	}
	
}
