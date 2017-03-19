/*
PRINT A SEQUENCE OF ASTERISK CHARACTERS IN THE FOLLOWING 
CONFIGURATION, CONTINUING FOR LINES NUMBER OF ASTERISKS.
LOOK AT BELOW PATTERN
*

 *

  *

   *

    *

     *

*/
class Pattern3{
	public static void main(String[] papan) {
		int num=5;
		for (int row=1 ; row<=num ; row++ ) {
			for (int column=1 ; column<=row ; column++ ) {
				System.out.println("*\n");
				break;
			}
			for (int space=1 ; space<=row ; space++ ) {
				System.out.print(" ");
			}
		}
	}
}

/*
D:\Felight\Basic Java>javac Pattern3.java

D:\Felight\Basic Java>java Pattern3
*

 *

  *

   *

    *
*/