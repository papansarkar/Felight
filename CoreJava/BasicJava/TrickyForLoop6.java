class TrickyForLoop6{
	public static void main(String[] papan) {
		int mysteryInt=100;
		for (int i=5 ; i>0 ; i--) {
			mysteryInt-=i;
			System.out.println(mysteryInt);
		}
	}
}
/*
D:\Felight\Basic Java>javac TrickyForLoop6.java

D:\Felight\Basic Java>java TrickyForLoop6
95
91
88
86
85
*/