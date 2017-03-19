/*
using switch statement write a java program
to find the number of days in a motnth with
year and month details are provided.
*/
class NumberOfDaysInAMonth{
	public static void main(String[] args) {
		int year=2020;
		String month="June";
		int days=0;
		switch(month){
			case "January" :
			case "March"   :
			case "May"     :
			case "July"    :
			case "August"  :
			case "October" :
			case "December":
			  days=31;
			  break;

			case "April"   :
			case "June"   :
			case "September"   :
			case "November"   :
			   days=30;
			   break;

			case "February":
			   if(year%4==0 && year%100!=0 || year%400==0){
			   	days=29;
			   }else 
			   days=28;
			   break;
			default :
			    System.out.println("Invalid options");
		}
		System.out.println("Number of days in "+month+" is "+days);
	}
}

/*

D:\Felight\Basic Java>javac NumberOfDaysInAMonth.java

D:\Felight\Basic Java>java NumberOfDaysInAMonth
Number of days in June is 30

*/