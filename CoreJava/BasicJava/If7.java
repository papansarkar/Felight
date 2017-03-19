class If7{
	public static void main(String[] felight){
		int x=1000;
		if(x==1000){
			//condition is true 
			int y=600;
			//this time above statement is valid 
			//because its a multi-statement if block
			//and we can access variable y
			//from inside the if block
			System.out.println(x++);
			//the above statement will print x=1000
			//and then will increment x by 1
		}
		System.out.println(x++);
		//this statement will print x=1001
		//and then will increment x by 1
		//now variable x holding integer value 1002
	}
}
/*
D:\Felight\Basic Java>javac If7.java

D:\Felight\Basic Java>java If7
1000
1001
*/
