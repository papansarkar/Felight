class Test{
	public static void main(String[] papan) {
		
		System.out.println(Calculator.add(10,10)+"\n");//Q.1

		System.out.println(Calculator.add(10,20,30)+"\n");//Q.2

		System.out.println(Calculator.add(12.3,4.56)+"\n");//Q.3

		System.out.println(Calculator.speed(87,7)+"\n");//Q.4

		System.out.println(Calculator.areaOfCircle(10)+"\n");//Q.5

		System.out.println(NumberSystem.factorial(5)+"\n");//Q.6

		System.out.println(NumberSystem.isEven(10)+"\n");//Q.7

		System.out.println(NumberSystem.isOdd(11)+"\n");//Q.8

		System.out.println("Is Prime : "+NumberSystem.isPrime(5)+"\n");//Q.9

		System.out.println(NumberSystem.isPalindrome(121)+"\n");//Q.10
		System.out.println("fibonacci");
		System.out.println(NumberSystem.fibonacci(10)+"\n");//Q.11

		System.out.println(NumberSystem.isDivisibleBy_6(45)+"\n");//Q.12

		System.out.println(Calculator.convertFromSecsToHrs(44586)+"\n");//Q.13
        //Q.14
		System.out.println(NumberSystem.digitCounter(4512433)+"\n"); 
		//Q.15
		System.out.println(NumberSystem.repeatDigitTwice(1234)+"\n");
		//Q.17
		System.out.println(NumberSystem.findHundredthDigit(4321)+"\n");
		//Q.18
		System.out.println(Calculator.requiredRunRate(300,50,250,42)+"\n");
		//Q.19
		System.out.println(NumberSystem.makeDecimal(1,2,3)+"\n");
		//Q.20
		System.out.println(NumberSystem.sum2Digit(15)+"\n");
		//Q.21
		System.out.println(NumberSystem.andBooleans(false,true,false)+"\n");
		//Q.22
		System.out.println(NumberSystem.largerThanOne(54,78,7)+"\n");
		//Q.23
		System.out.println(NumberSystem.numberInAscendingOrder(1,2,3)+"\n");
		//Q.24
		System.out.println(NumberSystem.sumOf4Digits(9009)+"\n");
		//Q.25
		System.out.println(Calculator.areaOfSquare(1,2,4,5)+"\n");
		//Q.26
		System.out.println(NumberSystem.addDigitNumbers(1,2,4)+"\n");
		//Q.27
		System.out.println(NumberSystem.multipleOf3_Or_7(14)+"\n");
		//Q.28
		System.out.println(NumberSystem.largestOfThree(12,45,6)+"\n");
		//Q.29
		System.out.println(Calculator.daysInMonth(2014,2)+"\n");
		//Q.30
		System.out.println(StringAndCharacters.changeCharCase('a')+"\n");
		//Q.31
		System.out.println(StringAndCharacters.isDigit('a')+"\n");
		//Q.32
		System.out.println(StringAndCharacters.middleChar('a','9','>')+"\n");
		//Q.33
		System.out.println(NumberSystem.sameLastDigit(54,14)+"\n");
		//Q.34
		System.out.println(NumberSystem.addForThird(1,2,3)+"\n");
		//Q.35
		System.out.println("Lottery Prize : "+Calculator.lotteryPrize(56)+"\n");
		//Q.36
		System.out.println("Total Prize : "+Calculator.lotteryPrize3(14,16,18)+"\n");
		//Q.37
		System.out.println("Sum of last 3 digits : "+NumberSystem.sumLast3(865123)+"\n");
		//Q.38
		System.out.println(NumberSystem.blackjack(21,23)+"\n");
		//Q.39
		System.out.println("Reverse of 3 digit Numbers : "+NumberSystem.reverse3(321)+"\n");
		//Q.40
		NumberSystem.isPerfactNumber(24);
		System.out.println();
		//Q.41
		System.out.println("Natural Numbers : "+NumberSystem.naturalNumbers(10)+"\n");
		//Q.42
		System.out.println("Random Numbers : "+ NumberSystem.randomNumber(10)+"\n");
		//Q.43
		System.out.println("Even numbers : "+NumberSystem.onlyEvens(2,20)+"\n");
		//Q.44
		System.out.println("Odd numbers : "+NumberSystem.onlyOdds(20,30)+"\n");
		//Q.45
		System.out.println("Prime numbers : "+NumberSystem.onlyPrimes(12,30)+"\n");
		//absolute value
		System.out.println("absolute value : "+NumberSystem.abs(-123));

		/*
		ARRAY ASSIGNMENTS 
		*/
		System.out.println("\t\t\t\tARRAY ASSIGNMENTS");
		//Q.1
		System.out.print("\n\nNatural Numbers : ");
		NumberSystem.arrayOfNaturalNumbers(10);
		//Q.2
		System.out.print("\n\nRandom Numbers : ");
		NumberSystem.arrayOfRandomNumbers(10);
		//Q.3
		//array of Q.1  is used as input
		System.out.println(NumberSystem.summationOfArrayElements(new int[]{1,2,3,4,5,6,7,8,9,10}));
		//Q.4
		//even numbers
		
	}
}