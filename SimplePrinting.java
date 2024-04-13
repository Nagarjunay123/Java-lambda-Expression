package Lamdba;

interface vehicle{
	public void drive();
}
class Car implements vehicle{
	@Override
	public void drive() {
		System.out.println("Car is driving");
	}
}
public class SimplePrinting {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.drive();
		
		Car car2=new Car() {
			public void drive() {
				System.out.println("Thar car is driving");
			}
		};
		car2.drive();
		
		vehicle car3= ()->{
			System.out.println("XUV 700 is driving");
		};
		car3.drive();
		
	}

}
