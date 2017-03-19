/*
WRITE JAVA PROGRAM TO PRINT ALL ODD NUMBERS FROM 1 TO 10 USING FOR LOOP
*/
class OneToTenOdd{
	public static void main(String[] papan) {
		for (int i=1 ; i<=10 ; i++ ) {
			if(i%2==1)
				System.out.println(i);
		}
	}
}

/*
D:\Felight\Basic Java>javac OneToTenOdd.java

D:\Felight\Basic Java>java OneToTenOdd
1
3
5
7
9
*/