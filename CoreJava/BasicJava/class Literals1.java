class Literals1{
	public static void main(String[] felight){
		int i =100;
		// here i is an int type
		long l= 100L;
		//use of letter L at the end of 100 to represent
		// same value of variable a as long type
		double d=3.142;
		// this value is a double type by default
		float f=3.142F;
		//use of letter F to represent same value of variable d as a type float
		double d1= 3.142D;
		//this is also type double 
		double u =3124e-3;
		//use of character sequence 'e-' to represent same value of variable d.
		long credit_Card_Number=1234_2345_3456_4567L;
		//use of underscore to differentiate between digits
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		System.out.println(d1);
		System.out.println(u);
		System.out.println(credit_Card_Number);
	}
}

/*

D:\Felight\Basic Java>javac Literals1.java

D:\Felight\Basic Java>java Literals1
100
100
3.142
3.142
3.142
3.124
1234234534564567
*/