import java.util.Scanner;

//Fazer um programa para ler tres números inteiros e mostrar na tela o maior deles.

public class AprendendoFuncao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos ver qual é o maior número!");
		System.out.println("Digite um primeiro número");
		int num1 = scan.nextInt();
		System.out.println("Digite um segundo número");
		int num2 = scan.nextInt();
		System.out.println("Digite um terceiro número");
		int num3 = scan.nextInt();
		
		//if(num1 > num2 && num1 > num3) {
			//System.out.println(num1 + " é o maior número digitado");
		//}else if (num2 > num3 && num2 > num1) {
			//System.out.println(num2 + " é o maior numero digitado");
		//}else {
		//	System.out.println(num3 +" é o maior numero digitado");
		//}
	
		int numeroMaior = max(num1, num2, num3);
		
		resultado(numeroMaior);
	
		scan.close();
	
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if( y > z) {
			aux = y;
		}else {
			aux = z;
			
		}
		return aux;
	}
	
	public static void resultado(int value) {
		System.out.println("Numero maior é: " + value);
	}

}
