//FIND THE RANG OF BYTE SHORT & INT WITH OUT USING ANY BUILT IN CLASSES .
class FindingRange{
	public static void main(String[] papan) {
		byte typeByte = 1;
		short typeShort = 1;
		int typeInt = 1;
		while(typeByte > 0)//condition will be true for all +ve byte numbers 
		//condition become false at minimum value of byte
			typeByte++;//will keep incrementing within the byte range(+ve to -ve) until the condition fails
		System.out.println(typeByte+" to "+ --typeByte);
		while(typeShort > 0)//condition will be true for all +ve short numbers
		//condition become false at minimum value of short
			typeShort++;//will keep incrementing within the short range(+ve to -ve) until the condition fails
		System.out.println(typeShort+" to "+ --typeShort);
		while(typeInt > 0)//condition will be true for all +ve int numbers
		//condition become false at minimum value of int
			typeInt++;//will keep incrementing within the int range (+ve to -ve) until the condition fails
		System.out.println(typeInt+" to "+ --typeInt);
	}
}

/*
D:\Felight\Basic Java>javac FindingRange.java

D:\Felight\Basic Java>java FindingRange
-128 to 127
-32768 to 32767
-2147483648 to 2147483647
*/