class CharTypeCasting{
	public static void main(String[] felight){
		//char type to numeric type
		int unicodeOfA='A';
		int unicodeOf1='1';
		char ch='*';
		int unicodeOfStar=ch;
		System.out.println("Unicode of A is " + unicodeOfA);
		System.out.println("Unicode of 1 is " + unicodeOf1);
		System.out.println("Unicode of * is " + unicodeOfStar);
		System.out.println("Unicode of X is " + (int)'X');
		System.out.println("Unicode of # is " + (int)'#');
		System.out.println("Unicode of 6 is " + (int)'6');
		//numeric type to char type
		int num=111;
		char var=(char)num;
		System.out.println("Character for unicode 111 is " + var);
		System.out.println("Character for unicode 60 is " + (char)60);
		System.out.println("Character for unicode 61 is " + (char)61);
		System.out.println("Character for unicode 121 is " + (char)(120+1));
	}
}
/*
D:\Felight\Basic Java>javac CharTypeCasting.java

D:\Felight\Basic Java>java CharTypeCasting
Unicode of A is 65
Unicode of 1 is 49
Unicode of * is 42
Unicode of X is 88
Unicode of # is 35
Unicode of 6 is 54
Character for unicode 111 is o
Character for unicode 60 is <
Character for unicode 61 is =
Character for unicode 121 is y
*/