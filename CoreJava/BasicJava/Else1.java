class Else1{
	public static void main(String[] felight){
		int x=10;
		int y;//not initialized
		if(x==10){ //condition true
			y=20; //initialized y inside if block
			System.out.println(x);
			System.out.println(y);
		} else {
			y=30;
			System.out.println(x);
			System.out.println(y);
		}
		System.out.println(y);
		 //accessing value of variable y 
		//from outside of if block
	}
}
/*
D:\Felight\Basic Java>javac Else1.java

D:\Felight\Basic Java>java Else1
10
20
20
*/