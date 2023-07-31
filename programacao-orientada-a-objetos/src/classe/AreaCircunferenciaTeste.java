package classe;

import java.awt.geom.Area;

public class AreaCircunferenciaTeste {
	
	public static void main(String[] args) {
		AreaCircunferencia area1 = new AreaCircunferencia(10);
		area1.pi = 10;
		System.out.println(area1.area());
		
		AreaCircunferencia area2 = new AreaCircunferencia(10);
		System.out.println(area2.area());
		
		AreaCircunferencia area3 =  new AreaCircunferencia(5);
		area3.pi = 5;
		System.out.println(area3.area());
		
	}

}
