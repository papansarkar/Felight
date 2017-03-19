class CheckingIfStringIsPalindrome{
	public static String isPalindrome(String str){
		String result="";
		if(str.equals(ReverseString.reversingString(str))){
			return result="Palindrome";
		}else
		return result="not palindrome";
	}
}