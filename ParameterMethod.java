package Lamdba;
interface vehicle1{
	public void drive(int speed,int distance);
}
class Car1 implements vehicle1{
	@Override
	public void drive(int s,int distance) {
		System.out.println("Car is driving at speed "+s);
	}
}
public class ParameterMethod {

	public static void main(String[] args) {
		Car1 car1=new Car1();
		car1.drive(50,100);
		
		// Anonymous class
		Car1 car2=new Car1() {
			public void drive(int s,int d) {
				System.out.println("Thar car is driving at speed "+s+" and travell in the distance "+d);
			}
		};
		car2.drive(50,100);
		
		//parameterized method
//		vehicle1 car3= (s)->{
//			System.out.println("XUV 700 is driving at speed "+s);
//		};
//		car3.drive(70);
		
		//Without curly braces
//		vehicle1 car3= s->{
//			System.out.println("XUV 700 is driving at speed "+s);
//		};
//		car3.drive(70);
		
		// if it is sigle line in the body no need of parenthesis
		vehicle1 car3= (s1,s2)->
			System.out.println("XUV 700 is driving at speed "+s1+s2);
			
		car3.drive(70,100);
		
	}

}
