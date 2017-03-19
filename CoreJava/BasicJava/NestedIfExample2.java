//nested if
class NestedIfExample2{
	public static void main(String[] felight){
		int num=6;
		if(num>0) //true
			if(num<10) //true
				if(num%2==0) //true
					System.out.println("Num is between 0 and 10 and even");
	}
}

/*

D:\Felight\Basic Java>javac NestedIfExample2.java

D:\Felight\Basic Java>java NestedIfExample2
Num is between 0 and 10 and even

*/