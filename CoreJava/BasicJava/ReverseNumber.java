//WRITE A JAVA PROGRAM TO REVERSE AN INTEGER NUMBER USING WHILE LOOP
class ReverseNumber{
	public static void main(String[] papan) {
		int number=123456789;
		int reversedNumber=0;
		int loopCounter=number;
		while(loopCounter>0){
			reversedNumber=reversedNumber*10;
			reversedNumber=reversedNumber+loopCounter%10;
			loopCounter=loopCounter/10;
		}
		System.out.println("Reverse of "+number+" is "+reversedNumber);
	}
}