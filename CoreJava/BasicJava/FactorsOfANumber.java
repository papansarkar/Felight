//PRINT ALL OF THE FACTORS OF A VALUE STORED IN THE VARIABLE NUMBER. ASSUME THE VALUE IS POSITIVE.
class FactorsOfANumber{
	public static void main(String[] papan) {
		int number=100;
		int count ,counter=0;
		for (count = 1 ; count<=number ; count++ ) {
			if( number%count == 0 ){
				counter++;
				System.out.println(count);
			}
		}
		System.out.println("Total number of factors : "+ counter);
	}
}

/*
D:\Felight\Basic Java>javac FactorsOfANumber.java

D:\Felight\Basic Java>java FactorsOfANumber
1
2
4
5
10
20
25
50
100
Total number of factors : 9
*/