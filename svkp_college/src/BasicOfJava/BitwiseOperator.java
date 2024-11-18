package BasicOfJava;

public class BitwiseOperator {

	    public static void main(String[] args) {
	        int a = 5;  
	        int b = 3;

	        // Bitwise AND
	        System.out.println("a & b: " + (a & b));  //  1

	        // Bitwise OR
	        System.out.println("a | b: " + (a | b));  //  7

	        // Bitwise XOR 

	        System.out.println("a ^ b: " + (a ^ b));  // 0110 = 6

	        // Bitwise NOT
	        System.out.println("~a: " + (~a));  // Inverts all bits, result depends on system

	        // Left shift
	        System.out.println("a << 2: " + (a << 2));  // 0101 becomes 10100 = 20
	    //multiples a number by 2^b  5*2^2 ->5*4 =20
	       
	        
	        // Right shift
	        System.out.println("a >> 2: " + (a >> 2));  // 0101 becomes 0001 = 1
	        //divide the number by 2^b   5/2^2-> 5/4 =1
	    }
	}
