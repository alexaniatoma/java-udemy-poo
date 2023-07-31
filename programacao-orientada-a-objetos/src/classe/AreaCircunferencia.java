package classe;

public class AreaCircunferencia {
	
	double raio;
	double pi;
	
	public AreaCircunferencia(double raioInicial) {
		pi = 3.14;
		raio = raioInicial;
		
	}
	
	double area() {
		
		return pi * Math.pow(raio, 2);
		//return pi * raio * raio;
		
	}
	
	
}


