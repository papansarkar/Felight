class GoodBadUgly{
	static public void main(String[] felight){
		String characterType="Good";
		switch(characterType){
			case "Good":
			      System.out.println("Blondie played by Client Eastwood");
			break;
			
		    case "Bad":
			      System.out.println("Sentenza played by Lee Van Cleef");
			break;

			case "Ugly":
			      System.out.println("Tuco played by Eli Wallach");
			break; 
		}
	}
}

/*

D:\Felight\Basic Java>javac GoodBadUgly.java

D:\Felight\Basic Java>java GoodBadUgly
Blondie played by Client Eastwood

*/