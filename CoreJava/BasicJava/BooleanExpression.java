class BooleanExpression{
	public static void main(String[] felight){
		int age=24;
		boolean isEligibleToVote=age>18;
		System.out.println(isEligibleToVote);
		int year=2020;
		boolean isLeapYear =(year % 4 == 0)&&(year % 100 != 0) || (year % 400 == 0);
		System.out.println(isLeapYear);	
	}
}
/*

D:\Felight\Basic Java>javac BooleanExpression.java

D:\Felight\Basic Java>java BooleanExpression
true
true

*/