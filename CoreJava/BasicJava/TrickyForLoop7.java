class TrickyForLoop7{
	public static void main(String[] papan) {
		for (int i=5 ; i>0 ; i-- ) {
			int mysteryInt=100;
			mysteryInt-=i;
			System.out.println(mysteryInt);
		}
	}
}

/*

D:\Felight\Basic Java>javac TrickyForLoop7.java

D:\Felight\Basic Java>java TrickyForLoop7
95
96
97
98
99

*/