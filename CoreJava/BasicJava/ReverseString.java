class ReverseString{
	public static String reversingString(String str){
		String newString="";
		int length=str.length();
		for (int i=length-1; i>=0 ; i-- ) {
			newString=newString+str.charAt(i);
		}
		return newString;
	}
}