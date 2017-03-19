//Simple example for if-then-else-if statement
/* Program to check if a number is +ve or -ve oe 0*/
class PositiveOrNegativeOrZero{
	public static void main(String[] felight){
		int number = -10;
		if (number==0) { //false
			System.out.println(number + " is Zero");
		}else if(number>0){ //false
			System.out.println(number + " is +ve number");
		}else{ //true
			System.out.println(number + " is -ve number");
		}
	}
}

/*

D:\Felight\Basic Java>javac PositiveOrNegativeOrZero.java

D:\Felight\Basic Java>java PositiveOrNegativeOrZero
-10 is -ve number

*/