package BasicOfJava;

public class DatatypeDemo {

	public static void main(String[] args) {
       byte bytemax =127;
       byte bytemin=-128;
       System.out.println("min range of byte is" + bytemin + "max range of byte"+ bytemax);
       short shortmax=32767;
       short shortmin=-32768;
       System.out.println("min range of short is"+ shortmin + "max range of short"+ shortmax);
       int maxint=2147483647;
       int minint=-2147483648;
       System.out.println("min range of int is"+minint+"max range of int"+maxint);
       long maxlong =92312786789675345L;
       long minlong =-9231278789675346L;
       System.out.println("min range of long is" +minlong+ "max range of long "+maxlong);
       float f=3242.1412245768f;
       double d=3456.1412245769d;
       System.out.println("float value "+f+"double "+d);
       boolean status=false;
       System.out.println("boolean value is"+status);
       char c='M';
       System.out.println("char value"+c);
       
	}

}
