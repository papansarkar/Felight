/*
WRITE A JAVA PROGRAM TO FIND SQUARE ROOT OF AN INTEGER USING DO WHILE LOOP
*/
class SquareRootUsingDoWhile{
	public static void main(String[] papan) {
		int num = 32;
		int i = 1;
		int iterations = 1;
		int curSum = 0;
		do {
			i+=2;
			iterations++;
			curSum+=i;
		}while(curSum + i < num);
		System.out.println(iterations);
	}
}

/*

D:\Felight\Basic Java>javac SquareRootUsingDoWhile.java

D:\Felight\Basic Java>java SquareRootUsingDoWhile
5

*/