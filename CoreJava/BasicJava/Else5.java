class Else5{
	public static void main(String[] felight){
		int i=10;
		if(i != 10) //false
			else //this else is the body of previous if statement
			// it will give an error
			//because its not attached with any if statement 
				System.out.println("Ompuri");
	}
}
/*

D:\Felight\Basic Java>javac Else5.java
Else5.java:5: error: 'else' without 'if'
                        else //this else is the body of previous if statement
                        ^
1 error

*/