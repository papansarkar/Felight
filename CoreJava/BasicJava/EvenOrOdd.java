//if-then-else statement
//program check of a number if its even or odd
class EvenOrOdd{
	public static void main(String[] felight){
		int num=11;
		if(num%2==0)//condition false
			System.out.println(num + " is Even");
		else //else block will execute
			System.out.println(num + " is Odd");
	}
}

/*

D:\Felight\Basic Java>javac EvenOrOdd.java

D:\Felight\Basic Java>java EvenOrOdd
11 is Odd

*/