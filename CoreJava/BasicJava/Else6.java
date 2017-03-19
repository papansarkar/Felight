class Else6{
	public static void main(String[] felight){
		int i=10;
		if(i+10)//this is not a valid if expression
			System.out.println("I am Super Star");
		else
			System.out.println("I am not star..Just huamn");
	}
}

/*
D:\Felight\Basic Java>javac Else6.java
Else6.java:4: error: incompatible types: int cannot be converted to boolean
                if(i+10)//this is not a condition
                    ^
1 error
*/