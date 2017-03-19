class CharCompare{
	public static void main(String[] felight){
		System.out.println('a'<'A');
		// false because unicode of a is 97 and
		//unicode of A is 65 .Obviously 97 is not 
		//less than 65.
		System.out.println('1'>'0');
		//In this statement unicode of 1 i.e 49 is 
		//compared with unicode of 0 i.e 48.So its 
		//true
		System.out.println(100>'0');
		//true because the number 100 is greater 
		//than unicode of 0,which is 48.
		System.out.println('6'<'Z');
		//unicode of 6 is 54
		//unicode of Z is 90
		//so statement is true
	}
}
/*


D:\Felight\Basic Java>javac CharCompare.java

D:\Felight\Basic Java>java CharCompare
false
true
true
true

*/