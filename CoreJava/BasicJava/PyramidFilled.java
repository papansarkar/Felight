/*
PRINT A PYRAMID FILLED WITH ASTERISK
*/
class PyramidFilled{
	public static void main(String[] papan) {
		int base=5;
		for (int row=0 ; row<base ; row++ ) {
			for (int j=0;j<base-row ; j++ ) {
				System.out.print(" ");
			}
			for (int k=0 ;k<=row ;k++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*

D:\Felight\Basic Java>javac PyramidFilled.java

D:\Felight\Basic Java>java PyramidFilled
     *
    * *
   * * *
  * * * *
 * * * * *

*/