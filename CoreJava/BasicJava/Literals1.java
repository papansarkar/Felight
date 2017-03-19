class Literals1{
	public static void main(String[] felight){
		int intType =100;
		// here intType is an int type
		long longType= 100L;
		//use of letter L at the end of 100 to represent same value of variable intType as long type
		double doubleType=3.142;
		// this value is a double type by default
		float floatType=3.142F;
		//use of letter F to represent same value of variable doubleType as a type float
		double doubleType1= 3.142D;
		//this is also type double 
		double scientific_Notation =3124e-3;
		//use of character sequences 'e-' to represent same value of variable doubleType(scientific notation).
		long credit_Card_Number=1234_2345_3456_4567L;
		//use of underscore to differentiate between digits
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(doubleType);
		System.out.println(floatType);
		System.out.println(doubleType1);
		System.out.println(scientific_Notation);
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