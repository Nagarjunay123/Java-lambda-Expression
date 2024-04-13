package Lamdba;

public class CalculatorLamdba {

	public static void main(String[] args) {
	
		Calculator c=(a,b)-> System.out.println("product : "+a*b);
		c.mul(10, 10);
	}
}
