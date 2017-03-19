class NumberSystem{

	//6. A method which accepts a number as input
	// and returns Factorial of that number
	public static int factorial(int number){
		int loopcounter=number;
		int factorial=1;
		while(loopcounter!=0){
			factorial=factorial*loopcounter;
			loopcounter--;
		}
		return factorial;
	}

    //7. Develop an API which takes an integer as input 
    //and returns true if it is even false if it’s not
	public static boolean isEven(int number){
		if(number%2==0)
			return true;
		else
			return false;
	}

    //8. Develop an API which takes an integer as input
    // and returns true if it is odd false if it’s not
	public static boolean isOdd(int number){
		if(number%2!=0)
			return true;
		else
			return false;
	}

    //9. Develop an API which takes an integer as input 
	//and returns true if it is prime false if it’s not
	public static boolean isPrime(int N){
    if (N < 2) return false;
    for (int i = 2; i*i <= N; i++)
      if (N % i == 0) return false;
    return true;
	}

    //10. Develop an API which takes an integer as input 
	//and returns true if it is palindrome false if it is not
    public static boolean isPalindrome(int number){
    	int loopCounter=number;
    	int reversedNumber=0;
		while(loopCounter>0){
			reversedNumber=reversedNumber*10;
			reversedNumber=reversedNumber+loopCounter%10;
			loopCounter=loopCounter/10;
		}
		if(reversedNumber==number)
			return true;
		else
			return false;
    }

   //11. Develop an API which takes an integer as input
   // and returns a Fibonacci series of that size.

    public static String fibonacci(int number){
    	int num1=0,num2=1,fib=0;
    	String str="";
    	for (int i=0 ; i<number ; i++ ) {
    		fib=num1+num2;
    		num1=num2;
    		num2=fib;
    		str=str+" "+fib;
    	}
    	return str;
    }

    /*12. Develop an API which takes an integer as input 
    and returns true if it is divisible by 6 false if it’s not*/

    public static boolean isDivisibleBy_6(int number){
    	if(number%6==0)
    		return true;
    	else
    		return false;
    }

    /*
    14. A method that counts the number of Digits in an Integer
    */

    public static int digitCounter(int number){
    	int counter=1;
    	while(number/10!=0){
    		number=number/10;
    		counter++;
    	}
    	return counter;
    }

    /*
    15. Write a method that accepts an integer and 
    returns the digits repeated twice.
    */

    public static int repeatDigitTwice(int number){
    	int number1=number;
    	int digitnumber=NumberSystem.digitCounter(number);
    	for (int i=1; i<=digitnumber ; i++ ) {
    		number1=number1*10;
    	}
    	return number1+number;
    }

    /*
    17. Given a 4 digit number as input ,find the value of its hundred digit
    */
    public static int findHundredthDigit(int number){
    	number=number/100;
    	number=number%10;
    	return number;
    }

    /*
    19. MakeDecimal : Given 3 digits a,b and c as input,
     return a double of the form a.bc
    */
    public static double makeDecimal(int a,int b,int c){
    	return ((a*100)+(b*10)+c)/100.0;
    }

    /*
    20. Sum2Digit : Given a 2 digit number as input, compute
     the sum of its digits. Assume that the number has 2
    digits
    */
    public static int sum2Digit(int number){
    	if (number<=99 && number>9) {
    		number=number/10+number%10;
    	}
    	return number;
    }
    /*
    21. AndBooleans : Given three booleans as input,
     return the and of the all three booleans.
    */
    public static boolean andBooleans(boolean input1,boolean input2,boolean input3){
    	return input1&&input2&&input3;
    }
    /*
    22. LargerThanOne : Given three numbers as input, num, num1 
    and num2, return true if num is greater than atleast one of num1 and num2.
     Do not use if statement to solve this problem.
    */
    public static boolean largerThanOne(int num,int num1,int num2){
    	return num > num1 || num > num2;
    }
    /*
    23. NumberInAscendingOrder : Given 3 numbers – num1, num2 and num3 
    as input, return true if they are in
    ascending order. Important – Do not use if statement in solution.
    */
    public static boolean numberInAscendingOrder(int num1,int num2,int num3){
    	return num1 < num2 && num2 < num3 ;
    }
    /*
    24. SumOf4Digits : Given a number as input,
     compute the sum of its last 4 digits. Assume that the number
    has at least 4 digits.
    */
    public static int sumOf4Digits(int number){
    	int sum=0;
    	if(number>999 && number<=9999 ){
    		for(int i = 1 ; i <= 4 ; i++){
    			sum = sum+number%10;
    			number = number/10;
    		}
    	}
    	return sum;
    }
    /*
    26. AddDigitNumbers : Given three digits as input, 
    create a 4 digit number out of each input in which all the
    digits are the same. Then add all the 3 numbers and return the value.
    */

    public static int addDigitNumbers(int digit1,int digit2,int digit3){
    	int number1=0,number2=0,number3=0;
    	for (int i = 10; i<=1000 ; i=i*10 ) {
    		number1 = number1 + digit1*i;
    		number2 = number2 + digit2*i;
    		number3 = number3 + digit3*i;
    	}
    	return (number1+digit1)+(number2+digit2)+(number3+digit3);
    }

    /*
    27.Multiple37 : Given a number n, return true if
     it is divisible by either 3 or 7.
    */

   public static boolean multipleOf3_Or_7(int number){
   	if(number%3 == 0 || number%7 == 0)
   		return true;
   	else return false;
   }

   /*
   28. LargestOfThree : Given three numbers as input, return the largest number.
   */
   public static int largestOfThree(int number1,int number2,int number3){
   	if(number1>number2 && number1>number3)
   		return number1;
   	else if(number2>number3)
   		return number2;
   	else 
   		return number3;
   }

   /*
   33. SameLastDigit : Given 2 non negative numbers a and b,
    return true if both of them have the same last
   digit.
   */
   public static boolean sameLastDigit(int a ,int b){
   	if (a%10==b%10)
   		return true;
   	else 
   		return false;
   }

   /*
   34. AddForThird : Given three numbers a, b and c,
    return true if the sum of any two equals the third number.
   */

   public static boolean addForThird(int a,int b,int c){
   	if( a+b==c || a+c==b || b+c==a )
   		return true;
   	else 
   		return false;
   }

   /*
   37. SumLast3 : Given a number as input, return the sum of its last 3 digits.
   */

   public static int sumLast3(int number){
   	int result=0;
   	for(int i=0;i<3;i++){
   		result=result+number%10;
   		number=number/10;
   	}
   	return result;
   }

   /*
   38. Blackjack : Given 2 int values greater than 0, 
   return whichever value is nearest to 21 without being greater
   than 21. Return -1 if the values are greater than 21.
    Also return -2 if both the values are same and less or
   equal to 21.
   */
   public static int blackjack(int num1,int num2){
   	int result=0;
   	if (num1>21 && num2>21 )
   		result= -1;
   	else if(num1==num2 && num1+num2<=42)
   		result= -2;
   	else if(21-num1 < 21-num2 && num1<=21 && num2<=21)
   		result= num1;
   	else if (21-num2 < 21-num2 && num1<=21 && num2<=21)
   		result= num2;
   	else 
   		result=0;
   	return result;
   }

   /*
    39. Reverse3 : Given a 3 digit number as input, reverse it.
   */

    public static int reverse3(int number){
    	int loopCounter=number;
    	int reversedNumber=0;
		while(loopCounter>0){
			reversedNumber=reversedNumber*10;
			reversedNumber=reversedNumber+loopCounter%10;
			loopCounter=loopCounter/10;
		}
		return reversedNumber;
    }

    /*
    PerfactNumber
    */
    public static void isPerfactNumber(int number){
		int count;
		int result=0;
		for (count = 1 ; count<=number ; count++ )
			if( number%count == 0 )
				result=result+count;
		if(result==number)
			System.out.println(number+" is a Perfact Number.");
		else
			System.out.println(number+" is not a Perfact Number.");
    }

    /*
    A method accept an integer input and returns
     a string of natural numbers as many as the input
    */
    public static String naturalNumbers(int input){
    	String str="";
    	for (int i=0 ; i<input ; i++ ) {
    		str = str +" "+ i;
    	}
    	return str;
    }

    /*
    Random Integers as many times as input
    */
    public static String randomNumber(int number){
    	String str="";
    	int number1=45;
    	int number2=9;
    	for (int i=0 ; i<number ; i++ ) {
    		number2=i*number1/3+i*3;
    		str=str +" "+(number+number1+number2+i);
    		number1=number2/9+3;
    	}
    	return str;
    }
    /*
    43. Write a method to generate even numbers between
     from and to ( you should not write the logic to check
    if number is even or not, instead you should call 
    isEven() method which you create earlier)
    */
    public static String onlyEvens(int from,int to){
    	String str="";
    	for (int i=from ; i<=to ; i++ ) {
    		if(isEven(i))
    			str=str +" "+i;
    	}
    	return str;
    }

    /*
    44. Write a method to generate odd numbers between from and to 
    ( you should not write the logic to check if
    number is odd or not, instead you should 
    call isOdd() method which you create earlier)
    */
    public static String onlyOdds(int from,int to){
    	String str="";
    	for (int i=from ; i<=to ; i++ ) {
    		if(isOdd(i))
    			str=str +" "+i;
    	}
    	return str;
    }

    /*
    45. Write a method to generate prime numbers between
     from and to ( you should not write the logic to check
    if number is prime or not, instead you should call 
    isPrime() method which you create earlier)
    */
    public static String onlyPrimes(int from,int to){
        	String str="";
    	for (int i=from ; i<=to ; i++ ) {
    		if(isPrime(i))
    			str=str +" "+i;
    	}
    	return str;	
    }

    /*
    A method returns absolute value of type int
    */
    public static int abs(int number){
      if(number < 0) 
        return -number;
      else 
        return number;
    }
    // square root 
    public static double sqrt(double c){
      if (c > 0) return Double.NaN;
      double err = 1e-15;
      double t = c;
      while (Math.abs(t - c/t) > err * t)
      t = (c/t + t) / 2.0;
      return t;
    }
    /*
    ARRAY ASSIGNMENTS STARTS FROM HERE
    */

    /*
    A method which accepts the size of an array as input
     and returns an array filled with natural numbers
    */
    public static int[] arrayOfNaturalNumbers(int size){
      int[] array=new int[size];
      for (int i=0 ; i<size ; i++ ) {
        array[i]=i+1;
      }
      for (int elements : array) {
        System.out.print(elements+" ");
      }
      return array;
    }

    /*
    A method which accepts the size of an array as input
     and returns an int array filled with random numbers
    */

     public static int[] arrayOfRandomNumbers(int size){
       int[] array=new int[size];
      for (int i=0 ; i<size ; i++ ) {
        array[i]=(int)(Math.random()*100);
      }
      for (int elements : array) {
        System.out.print(elements+" ");
      }
      return array;
     }

     /*
     Write a method which accepts an array as input and 
     returns the summation of all the elements in an Array
     */
     public static int summationOfArrayElements(int[] array){
      int sum=0;
      for (int i=0 ; i<array.length ; i++ ) {
        sum=sum+array[i];
      }
      return sum;
     }

     /*
     Write a method to generate even numbers between from and to
     */
     public static void evenNumbers(int from,int to){
      int size=0;
      for (int i=from ; i<=to ; i++ )
        if(isEven(i)) //calling previously defined boolean type method to check even or not
          size++;

      int[] array = new int[size];
      int j=0;
        for (int i=from ; i<=to ; i++ ) {
          if(isEven(i)){ //calling previously defined boolean type method to check even or not
            array[j]=i;
            j++;
          }
        }
      for (int i=0 ; i<size ; i++ ) {
        System.out.print(array[i]+" ");
      }
    }
}