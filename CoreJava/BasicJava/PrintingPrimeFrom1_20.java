/*WRITE JAVA PROGRAM TO PRINT ALL PRIME NUMBERS FROM 1 TO 20 USING FOR LOOP*/
class PrintingPrimeFrom1_20{
	public static void main(String[] papan){
		int to = 1,from =20;
		int count;
		int counter=0;
		boolean prime=false;
		for ( to=1 ; to<=from ; to++ ) {
			for ( count=2 ; count<to ; count++ ) {
				if(prime=to%count==0 && to>1 ){
					System.out.print("");
					break;
				}
			}
			if(prime==false && to>1 ){
				System.out.println(to);
				counter++;//counting the prime numbers 
			}
		}
		System.out.println("The Total number of prime numbers is " + counter);
	}
}

/*
D:\Felight\Basic Java>javac PrintingPrimeFrom1_20.java

D:\Felight\Basic Java>java PrintingPrimeFrom1_20
2
3
5
7
11
13
17
19
The Total number of prime numbers is 8
*/