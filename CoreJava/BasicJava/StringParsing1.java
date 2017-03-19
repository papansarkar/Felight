class StringParsing1{
	public static void main(String[] felight){
		String empId="1001";
		//Parsing String to Integer
		int id =Integer.parseInt(empId);
		System.out.println(id);
		String empSalary="606060.60";
		//Parsing String to Double
		double salary =Double.parseDouble(empSalary);
		System.out.println(salary);
	}
}
/*

C:\Users\Felight Students\157>javac StringParsing1.java

C:\Users\Felight Students\157>java StringParsing1
1001
606060.6

*/