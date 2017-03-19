/*
WRITE A JAVA PROGRAM TO PRINT NUMBER SEQUENCE IN BELOW PATTERN.
1 2 3 4 5

2 4 6 8 10

3 6 9 12 15

4 8 12 16 20

5 10 15 20 25
*/

class Pattern2{
	public static void main(String[] papan) {
		for (int row=1 ; row<=5 ; row++ ) {
			for(int column=1 ; column<=5 ; column++)
				System.out.print(column*row+" ");
		System.out.println();
		}
	}
}
/*
D:\Felight\Basic Java>javac Pattern2.java

D:\Felight\Basic Java>java Pattern2
1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20
5 10 15 20 25
*/