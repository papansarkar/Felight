package ModuleString;

/**
 * Created by PAPAN on 2/18/2017.
 */
public class StringAssignments {

    public static String clubbedStringUsingFirstLetters(String str) {
        String newString = "" + str.charAt(0);
        int l = str.length();
        for (int i = 1; i < l; i++) {
            if (str.charAt(i) == ' ') {
                newString = newString + str.charAt(i + 1);
            }
        }
        return newString.toUpperCase();
    }

    public static String reverseString(String str) {
        String newString = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }
        return newString;
    }

    public static boolean isEmailValid(String email) {
        email = email.toLowerCase();
        int length = email.length();
        String domain = "";
        for (int i = length - 4; i <= length - 1; i++) {
            domain = domain + email.charAt(i);
        }
        if (domain.equals(".com") && email.contains("@") && email.charAt(0) != '@') {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isPalindrome(String str) {
        if (str.equals(reverseString(str))) {
            return true;
        } else
            return false;
    }

    public static boolean isAnagram(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase(); //case insensitive
        if (first.length() != second.length())
            return false;
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            if (second.contains("" + ch)) {
                first.replace(first.charAt(i), '*');
                second.replace(ch, '*');
            } else return false;
        }
        return true;
    }

    public static String removeChar(String word, char ch) {
        word = word.toLowerCase();//Case insensitive
        if (word.length() < 2)
            return "Inappropriate Word size(<2) !!! ";
        else if (word.contains("" + ch)) {
            while (word.contains("" + ch))
                word = word.substring(0, word.indexOf(ch)) + word.substring(word.indexOf(ch) + 1, word.length());
            return word;
        } else
            return "Word does not contain the specified character !!!";
    }

    public static void splitString(String str) {
        if (str.charAt(0) != ',' && str.charAt(str.length() - 1) != ',' && str.contains(""+','+',')==false) {
            str=str.toUpperCase();
            //counting number of commas
            String str1 = str;
            int noOfCommas = 0;

            while (str1.contains("" + ',')) {
                noOfCommas++;
                str1 = str1.substring(str1.indexOf(',') + 1);
            }
            System.out.println("No of items : "+(noOfCommas+1));//debugging

            String[] strArray = new String[noOfCommas + 1];

            for (int i = 0; i < noOfCommas; i++) {
                strArray[i] = str.substring(0, str.indexOf(','));
                // System.out.print(strArray[i] +" ");//debugger
                str = str.substring(str.indexOf(',') + 1);
            }
            strArray[noOfCommas] = str;

            for (int i = 0; i < noOfCommas + 1; i++)
                System.out.print(strArray[i] + "\t");

        } else System.out.println("Unacceptable input format !!!");
    }

    public static String[] returnString(String str,int howManyTimes){
        String[] strArray=new String[howManyTimes];
        for(int i=0 ; i<howManyTimes ; i++){
            strArray[i]=str;
        }
        return strArray;
    }

}