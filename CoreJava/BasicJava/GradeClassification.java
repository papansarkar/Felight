class GradeClassification{
	public static void main(String[] felight){
		int score=60;
		char grade='X';
		if (score>=75){
			grade='A';
		}else if(score>=60){
			grade='B';
		}else if(score>=50){
			grade='C';
		}else if(score>=35){
			grade='D';
		}else {
			grade='F';
		}
	

        switch(grade){
	        case 'A':
	          System.out.println("You got Distinction");
	        break;

	        case 'B':
	          System.out.println("You got First class");
	        break;

	        case 'C':
	          System.out.println("You got Second class");
	        break;

	        case 'D':
	          System.out.println("Just pass");
	        break;

	        case 'F':
	          System.out.println("I hope you love working in technical support");
	        break;
        }
    }    
}

/*

D:\Felight\Basic Java>javac GradeClassification.java

D:\Felight\Basic Java>java GradeClassification
You got First class

*/