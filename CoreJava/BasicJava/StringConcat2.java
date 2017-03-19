class StringConcat2{
	public static void main(String[] felight){
		int i=1,j=1;
		System.out.println("i + j is "+i+j);
		/*
		Here in the parentheses, values of variable i and 
		j act as strings and gets printed through string concatenation
		because in string concatenation '+' operator can concat primitive types as a string.
		*/
		System.out.println("i + j is "+(i+j));
        /*
        here in the inside parentheses, values of i & j gets added and then the total value act as a
		string and gets printed.String concatenation occurs after the opration of inside parentheses.
		*/		
	}
}