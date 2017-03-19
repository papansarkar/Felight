class TrickyWhile1{
	public static void main(String[] papan) {
		int count=0;
		while(count++ < 10)//Like "if" for while
		    //also flower braces are optional
		    //if its body contains only single
		    //statement 
		    System.out.println("I am Batman " + count);
		System.out.println(count);
		//above is equal to below
		/*
		while(count++ < 10){
			System.out.println("I am Batman " + count);
		}
		System.out.println(count)
		*/
	}
}

/*
D:\Felight\Basic Java>javac TrickyWhile1.java

D:\Felight\Basic Java>java TrickyWhile1
I am Batman 1
I am Batman 2
I am Batman 3
I am Batman 4
I am Batman 5
I am Batman 6
I am Batman 7
I am Batman 8
I am Batman 9
I am Batman 10
11
*/