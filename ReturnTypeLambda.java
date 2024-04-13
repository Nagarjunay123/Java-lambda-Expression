package Lamdba;

interface vehicle2{
	public int drive(int speed);
}
public class ReturnTypeLambda {

	public static void main(String[] args) {
		vehicle2 v=s->  s;
			
		
		
		System.out.println(v.drive(10));
	}

}
