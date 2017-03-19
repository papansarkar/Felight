class Literals {
	public static void main(String[] felight){
		long creditCardNumber=1234234534564567L;
        //use of letter L to represent type long
	    long socialSecurityNumber=999_99_9999L;
		//use of character '_' to differentiate between digits
		float PI=3.14_15F;
		//use of F to represent a float type literel
		long hexBytes=0xFF_EC_DE_5E;
		// use of character sequence '0x' to represent a hexadecimal number
		long hexWords=0xCAFE_BABE;
		long maxLong=0x7fff_ffff_ffff_ffffL;
		byte nybbles=0b0010_0101;
		long bytes=0b11010010_01101001_10010100_10010010;
		System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(PI);
		System.out.println(hexBytes);
		System.out.println(hexWords);
		System.out.println(maxLong);
		System.out.println(nybbles);
		System.out.println(bytes);
		
	}
}

/*
D:\Felight\Basic Java>javac Literals.java

D:\Felight\Basic Java>java Literals
1234234534564567
999999999
3.1415
-1253794
-889275714
9223372036854775807
37
-764832622
*/