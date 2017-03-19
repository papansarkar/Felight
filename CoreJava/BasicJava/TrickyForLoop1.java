class TrickyForLoop1{
	public static void main(String[] papan) {
		for (int i=0;i<10 ;++i ) {
			System.out.println("i : "+i);
		}
		System.out.println(i);
	}
}
/*

D:\Felight\Basic Java>javac TrickyForLoop1.java
TrickyForLoop1.java:6: error: cannot find symbol
                System.out.println(i);
                                   ^
  symbol:   variable i
  location: class TrickyForLoop1
1 error

*/