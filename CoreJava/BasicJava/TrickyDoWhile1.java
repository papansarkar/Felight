class TrickyDoWhile1{
	public static void main(String[] papan) {
		int i=0;
		do{
			System.out.println(i);//only once will execute
		}while(++i == 500);//in first iteration loop will break bcuz (1 != 500)
	}
}
/*

D:\Felight\Basic Java>javac TrickyDoWhile1.java

D:\Felight\Basic Java>java TrickyDoWhile1
0

*/