/*
WRITE JAVA PROGRAM TO PRINT ALL EVEN NUMBERS FROM 1 TO 10 USING FOR LOOP
*/
class OneToTenEven{
	public static void main(String[] papan) {
		for (int i=1 ; i<=10 ; i++ ) {
			if(i%2==0)
				System.out.println(i);
		}
	}
}
/*
D:\Felight\Basic Java>javac OneToTenEven.java

D:\Felight\Basic Java>java OneToTenEven
2
4
6
8
10
*/