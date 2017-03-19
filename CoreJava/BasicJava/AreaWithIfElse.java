class AreaWithIfElse{
	public static void main(String[] felight){
		final double PI=3.142;
		double radius = -123.123;
		//if the output of the expression is true
		//the the body of if will execute
		if(radius>0){ //condition false
			double area = radius*radius*PI;
			System.out.println(area);
		} else 
		    System.out.println("Radius should be greater than zero");
		    //else block will execute
	}
}

/*
D:\Felight\Basic Java>javac AreaWithIfElse.java

D:\Felight\Basic Java>java AreaWithIfElse
Radius should be greater than zero
*/