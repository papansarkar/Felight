/*
WRITE A JAVA PROGRAM TO PRINT BELOW PATTERN.
#####

#####

#####

#####

#####

#####
*/
class Pattern1{
	public static void main(String[] papan) {
		for (int row=0 ; row<7 ; row++ ) {//this loop is for rows
			for (int column=0 ; column<5 ; column++) {//this loop is for columns
				System.out.print("#");
			}
			System.out.println("");
		}
	}
}
/*
D:\Felight\Basic Java>javac Pattern1.java

D:\Felight\Basic Java>java Pattern1
#####
#####
#####
#####
#####
#####
#####
*/