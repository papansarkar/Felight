//PRINT THE NUMBERS BETWEEN LOW AND HIGH THAT ARE EVENLY DIVISIBLE BY FOUR BUT NOT BY FIVE
class DivisibleByFourButNotFive{
	public static void main(String[] papan) {
		int low=1,high=100;
		int count;
		for ( count=low ; count<=high ; count++ ) {
			if( count%4==0 && count%5!=0 )
				System.out.print(count+" ");
		}
	}
}
/*
D:\Felight\Basic Java>javac DivisibleByFourButNotFive.java

D:\Felight\Basic Java>java DivisibleByFourButNotFive
4 8 12 16 24 28 32 36 44 48 52 56 64 68 72 76 84 88 92 96
*/