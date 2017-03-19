class Calculator{
	/*
	A METHOD WHICH ACCEPTSW TWO INTEGERS AS 
	ARGUMENTS AND RETURNS ADDITION OF THREE NUMBERS
	*/
	public static int add(int num1,int num2){
		return num1+num2;
	}

	/*
	A METHOD WHICH ACCEPTS THREE INTEGERS AS
	 ARGUMENTS AND RETURNS ADDITION OF THREE NUMBERS
	*/
	public static int add(int num1,int num2,int num3){
		return num1+num2+num3;
	}

	/*
	A METHOD WHICH ACCEPTS TWO DOUBLE NUMBERS AS
	 ARGUMENTS AND RETURNS ADDITION OF TWO NUMBERS
	*/
	public static double add(double num1,double num2){
		return num2+num2;
	}

	/*
	4. A method takes time and distance as input and returns speed.
	*/
	public static float speed(int distance ,int time){
		return distance/time;
	}

	//5.Write an API which accepts radius as
	// input and return area of a Circle as output
	public static double areaOfCircle(int radius){
		final double PI=3.14;
		return PI*radius*radius;
	}

	/*
	13. A method accepts the time in seconds and returns the time in hours
	*/
	public static double convertFromSecsToHrs(int secs){
		return secs/(60*60);
	}

	/*
	18. Calculate RequiredRunRate : A team is chasing the
	 target set in a one day international match. The
    objective is to compute the required run rate. 
    The following have provided as input: target, maxOvers,
    currentScore, oversBowled
	*/
	public static double requiredRunRate(int target,int maxOvers,int currentScore,double oversBowled){
		int requiredRun = target - currentScore;
		double overRemained = maxOvers - oversBowled;
		return requiredRun/overRemained;
	}

	/*
	25. AreaOfSquare : You have been given 4 inputs x1,y1,x2 and y2. 
	The points (x1,y1) and (x2,y2) represent the
    end points of the diagonal of a square. Return the area of the square
    */
    public static double areaOfSquare(int x1,int y1,int x2,int y2){
    	double area = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))/2;
    	return area;
    }

    /*
    29. DaysInMonth : Given the number of the month in 2014 
    (1 for January, 12 for December), return the
    number of days in it.
    */

   public static int daysInMonth(int year ,int month){
   	int days=0;
   	 switch(month){
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
			  days=31;
			  break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
			   days=30;
			   break;
			case 2 :
			   if(year%4==0 && year%100!=0 || year%400==0){
			   	days=29;
			   }else 
			   days=28;
	    }
	    return days;	    
    }


    /*
    35. LotteryPrize: Jack bought a lottery ticket. He will get a 
    reward based on the number of the lottery ticket.
    The rules are as follows – If the ticket number is divisible by 4,
     he gets 6 – If the ticket number is divisible by 7,
    he gets 10 – If the ticket number is divisible by both 4 and 7,
     he gets 20 Otherwise, he gets 0. Given the
    number of thelottery ticket as input, compute the reward he will receive.
    */

    public static int lotteryPrize(int number){
    	int prizeMoney=0;
    	if(number%4==0 && number%7!=0)
    		prizeMoney=6;
    	else if(number%7==0 && number%4!=0)
    		prizeMoney=10;
    	else if(number%28==0)
    		prizeMoney=20;
    	else 
    		prizeMoney=0;
    	return prizeMoney;
    }
    /*
    36. LotteryPrize: Jack bought a lottery ticket. He will get a 
    reward based on the number of the lottery ticket.
    The rules are as follows – If the ticket number is divisible by 4,
     he gets 6 – If the ticket number is divisible by 7,
    he gets 10 – If the ticket number is divisible by both 4 and 7,
     he gets 20 Otherwise, he gets 0. Given 3
    number of thelottery ticket as input, compute the total reward he will receive.
    */
    public static int lotteryPrize3(int number1,int number2,int number3){
    	number1=lotteryPrize(number1);
    	number2=lotteryPrize(number2);
    	number3=lotteryPrize(number3);
    	return number1+number2+number3;
    }


}