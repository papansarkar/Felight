/*
WRITE A JAVA PROGRAM TO PRINT HOLLOW RIGHT ANGLE TRIANGLE
*/
class Triangle1{
	public static void main(String[] papan) {
		int height=10;
		for (int row=1 ; row<=height ; row++ ) {
			for (int column=1 ; column<=row ; column++ ) {
				if(row-column >= 0 || row==height || column==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}

/*
D:\Felight\Basic Java>javac Triangle1.java

D:\Felight\Basic Java>java Triangle1
*
**
***
****
*****
******
*******
********
*********
**********

*/