class ScopeOfVariable{
	public static void main(String[] papan) {
		for (int i=0; i<10; i++) {
			System.out.println("Jai Hanuman");
		}
		//System.out.println(i);//error because
		//scope of i is within the loop
		//if we want to access i then we need to
		//declare i before the loop the within the 
		//loop its value may change 
		//then after the loops we can access it
		//examlpe 
		int j;//scope of starts from here 
		for (j=0; j<2; j++) {
			System.out.println("j : " + j);
		}
		System.out.println(j);//accessable as its scope
		//within the main method
	}
}

/*
D:\Felight\Basic Java>javac ScopeOfVariable.java

D:\Felight\Basic Java>java ScopeOfVariable
Jai Hanuman
Jai Hanuman
Jai Hanuman
Jai Hanuman
Jai Hanuman
Jai Hanuman
Jai Hanuman
Jai Hanuman
Jai Hanuman
Jai Hanuman
j : 0
j : 1
2
*/