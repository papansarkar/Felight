//Simple example for if-then-else-if statement
/* Program to allocate the grade according to percentage*/
class Grade{
	public static void main(String[] felight){
		int score=60;
		char grade='X';

		if (score>=75) { //false
			grade='A';
		}else if(score>=60){ //true
			grade='B';
		}else if(score>=50){
			grade='C';
		}else if(score>=35){
			grade='D';
		}else {
			grade='F';
		}
		System.out.println("Your Grade is " + grade);
	}
}

/*

D:\Felight\Basic Java>javac Grade.java

D:\Felight\Basic Java>java Grade
Your Grade is B

*/