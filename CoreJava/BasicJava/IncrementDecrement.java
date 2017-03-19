class IncrementDecrement {
	public static void main(String[] felight) {
		int i = 0;
		i = i + 1;
		System.out.println(i++);
		//here i first printed as previous value 1 and then incremented by 1(i=2).
		System.out.println(++i);
		//here i first incremented by 1 (i=3) and the printed.
		System.out.println(i--);
		//here i first printed as previous value 3 and then decremented by 1(i=2).
		System.out.println(--i);
		////here i first decremented by 1 (i=1) and the printed.
	}
}

/*
D:\Felight\Basic Java>javac IncrementDecrement.java

D:\Felight\Basic Java>java IncrementDecrement
1
3
3
1
*/