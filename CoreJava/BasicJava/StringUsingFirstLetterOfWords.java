class StringUsingFirstLetterOfWords{
	public static String makingString(String str){
		String newString=""+str.charAt(0);
		int l=str.length();
		for (int i=1 ; i<l ; i++ ) {
			if(str.charAt(i)==' '){
				newString=newString+str.charAt(i+1);
			}
		}
		return newString;
	}
}