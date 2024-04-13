package Lamdba;

public class ActionCharArray {
	static void actionchar(char [] c,CharArray charArray) {
		for(char ch:c) {
		charArray.action(ch);
		}
	}
	public static void main(String[] args) {
		char [] ch= {'n','a','g'};
		
		actionchar(ch, (c)->{
			System.out.println(Character.toUpperCase(c));
		});
	
	}
	
}
