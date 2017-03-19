class CheckingEmailId{
	public static String isValid(String str){
		int length=str.length();
		String domain="";
		String result="";
		for (int i=length-4 ; i<=length-1 ; i++ ) {
			domain=domain+str.charAt(i);
		}
		if(domain.equals(".com")){
			result="Valid";
		}else {
			result="not valid "+domain;
		}
		return result;
	}
}