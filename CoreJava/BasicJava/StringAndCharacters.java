class StringAndCharacters{
	/*
	30. ChangeCharCase : A method which accepts a cha
	r as intput and returns a char whoes case if changed.
	*/
	public static char changeCharCase(char ch){
		int ch1=ch;
		if(ch1>=65 && ch1<=90){
			ch1=ch1+32;
			ch=(char)ch1;
			return ch;
		}
		else{ 
			ch1=ch1-32;
			ch=(char)ch1;
			return ch;
		}
	}

	/*
    31. IsDigit : Given a char as input, return 
    true if it is a digit (i.e. between 0 to 9).
	*/

	public static boolean isDigit(char ch){
		int ch1=ch;
		if (ch1>=48 && ch1<=57) {
			return true;
		}else return false;
	}

	/*
    32. MiddleChar : Given three chars as input, return the char that
     would come in the middle if the chars were
    arranged in order. Note that > operator can be used for chars.
	*/

	public static char middleChar(char ch1,char ch2,char ch3){
		int unicode1,unicode2,unicode3;
		unicode1 = ch1;
		unicode2 = ch2;
		unicode3 = ch3;
		if(unicode1<unicode2 && unicode1>unicode3){
			ch1=(char)unicode1;
			return ch1;
		}
		else if (unicode2<unicode1 && unicode2>unicode3){
			ch2=(char)unicode2;
			return ch2;
		}
		else {
			ch3=(char)unicode3;
			return ch3;
		}
	}
}