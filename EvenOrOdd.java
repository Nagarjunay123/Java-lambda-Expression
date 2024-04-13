package Lamdba;
interface EvenOdd{
	public int evenodd(int num);
}
public class EvenOrOdd {

	public static void main(String[] args) {

		EvenOdd evenOdd=(n)->{
			if(n%2==0) {
				return n;
			}
			else {
				return 0;
			}
		};
		int x=evenOdd.evenodd(10);
		if(x!=0) {
			System.out.println("even");
		}
	}

}
