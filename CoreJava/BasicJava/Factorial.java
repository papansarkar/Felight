//WRITE A JAVA PROGRAM TO FIND FACTORIAL OF A NUMBER USING WHILE LOOP 
class Factorial{
	public static void main(String[] papan) {
		int number=6;
		int loopcounter=number;
		int factorial=1;
		while(loopcounter!=0){
			factorial=factorial*loopcounter;
			loopcounter--;
		}
		System.out.println("Factorial of "+number+" is "+factorial);
	}
}

/*

D:\Felight\Basic Java>javac Factorial.java

D:\Felight\Basic Java>java Factorial
Factorial of 6 is 720

*/