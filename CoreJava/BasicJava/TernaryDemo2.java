class TernaryDemo2{
	public static void main(String[] papan){
		int x =10;
		int y=x > 0 ? 1 : -1;
		System.out.println(y);

		String str="India";
		String data=str.contains("I") ? "Str contains 'I'" : "Str doesn't contains 'I'";
		System.out.println(data);

		int num1 = 10;
		int num2 = 60;
		int max = num1 > num2 ? num1 : num2 ;
		System.out.println(max + " greater amoung "+num1+ " & " + num2);
        
        String foo = "";//foo is initialized ; not null .
		System.out.println("foo is "+ ((foo==null) ? "not set" : "foo"));

		int credits = 60;
		String year = credits < 30 ? "freshman" : 
		               credits<= 59 ? "sophomore" :
		                credits <= 89 ? "Junior" : "Senior" ;
		System.out.println(year);
		
		//smallest among 3 number using ternary operator
		x = 10; y = 6; //x & y already defined so just reinitiating here
		int z = 100;
		int min = x < y ? (x < z ? x : z) : (y < z ? y : z);
		System.out.println(min);                
 	}
}
/*

D:\Felight\Basic Java>javac TernaryDemo2.java

D:\Felight\Basic Java>java TernaryDemo2
1
Str contains 'I'
60 greater amoung 10 & 60
foo is foo
Junior
6

*/