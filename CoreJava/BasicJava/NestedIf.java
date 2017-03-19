//Nested if example
class NestedIf{
	public static void main(String[] felight){
		int num1=100;
		int num2=20;
		int num3=60;
		if(num1>num2) //true 
			if(num1>num3) //true
				System.out.println("Num1 is greater than num2 & num3");
	}
}

/*

D:\Felight\Basic Java>javac NestedIf.java

D:\Felight\Basic Java>java NestedIf
Num1 is greater than num2 & num3

*/