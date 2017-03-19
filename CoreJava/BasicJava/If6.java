class If6 {
	public static void main(String[] felight){
		int x=1000;
		if(x==1000)
			//condition true
			int y=600;
		//but the compiler will give an error
		//because we cant declare variable in a
		//single if statement because
		//it will not be visible outside of if block
		System.out.println(y);
	}
}
/*
D:\Felight\Basic Java>javac If6.java
If6.java:6: error: variable declaration not allowed here
                        int y=600;
                            ^
1 error
*/