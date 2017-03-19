class FinalVariables3{
	public static void main(String[] felight){
		final String PM="Modi";
	    // PM="Rahul Gandhi"; 
		/*
		this above statement cannot be compiled as the String variable PM already declared as 
		final. That means the variable PM is a constant variable.
		*/
		System.out.println(PM);
	}
}
/*
D:\Felight\Basic Java>javac FinalVariables3.java

D:\Felight\Basic Java>java FinalVariables3
Modi
*/