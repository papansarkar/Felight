class Else2{
	public static void main(String[] felight){
		int i=0;
		if(i++ == 0) // condition true 
		//first compared then increased
			System.out.println("I am Batman");
			//only the above statement will execute
		else if(i++ == 1)
			System.out.println("I am Spierman");
		else
			System.out.println("I am Me");
	}
}
/*
D:\Felight\Basic Java>javac Else2.java

D:\Felight\Basic Java>java Else2
I am Batman
*/