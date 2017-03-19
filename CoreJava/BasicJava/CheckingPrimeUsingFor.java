/*WRITE JAVA PROGRAM TO CHECK IF A NUMBER IS PRIME OR NOT USING FOR LOOP*/
class CheckingPrimeUsingFor{
	public static void main(String[] papan) {
		int number=11;
		int count;
		boolean isPrime=false;
		for ( count = 2 ; count < number ; count++ ) {
			if(isPrime=number%count==0 && number > 1){//Composite numbers must be (>1) and have more 2 factors
				System.out.println(number + " is Not Prime");
				break;
			}
		}
		if(isPrime==false && number > 1){//Prime number must be (>1) and have only 2 factors
			System.out.println(number + " is Prime Number");
		}else if(number <= 1)
		    System.out.println("Number is neither prime nor composite (It maybe 1 or 0 or -ve)");
	}
}

/*

D:\Felight\Basic Java>javac CheckingPrimeUsingFor.java

D:\Felight\Basic Java>java CheckingPrimeUsingFor
11 is Prime Number

*/