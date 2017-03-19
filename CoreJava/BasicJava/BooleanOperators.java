class BooleanOperators{
	public static void main(String[] felight){
		int age=25;
		System.out.println(age>18 && age<120);
		//Checking if eligable to vote or not 
		int year=2020;
		System.out.println((year % 4 == 0) && (year % 100 == 0) || (year % 400 == 0));
		//checking if the is leap year or not
	}
}
/*

D:\Felight\Basic Java>javac BooleanOperators.java

D:\Felight\Basic Java>java BooleanOperators
true
false

*/