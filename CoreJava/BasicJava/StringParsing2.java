class StringParsing2{
	public static void main(String[] felight){
		String empId="e1";
		//Parsing String to Integer
		int id =Integer.parseInt(empId);
		System.out.println(id);
        // This program will compile but will not execute any output
		//because for type String value e1 there is no Integer unicode value exists.
	}
}
/*

C:\Users\Felight Students\157>javac StringParsing2.java

C:\Users\Felight Students\157>java StringParsing2
Exception in thread "main" java.lang.NumberFormatException: For input string: "e1"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at StringParsing2.main(StringParsing2.java:4)
*/