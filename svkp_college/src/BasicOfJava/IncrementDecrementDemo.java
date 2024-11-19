package BasicOfJava;

public class IncrementDecrementDemo {

	public static void main(String[] args) {
		int a=10;
		
		//post increment
		System.out.println("a++  " + a++);
		System.out.println("after post-increment a   "+ a); //11
		
		//pre increment
		System.out.println("++a  " + ++a);
		
		//post decrement
		System.out.println("a--  " + a--);
		System.out.println("after post decrement a   " + a); //11
		
		//pre decrement
		System.out.println("--a "+ --a);
	}

}
