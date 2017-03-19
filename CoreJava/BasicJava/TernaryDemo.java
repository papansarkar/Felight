class TernaryDemo{
	public static void main(String[] felight) {
		int num=10;
		//even or odd using if-then-else statement
		if(num%2==0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
		//Even or odd using ternary operator
		System.out.println(num%2==0? "Even" : "Odd");
	}
}
/*
D:\Felight\Basic Java>javac TernaryDemo.java

D:\Felight\Basic Java>java TernaryDemo
Even
Even
*/