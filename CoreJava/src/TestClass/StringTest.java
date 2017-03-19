package TestClass;

import ModuleString.StringAssignments;
import ModuleString.UseOfStringMethods;

/**
 * Created by PAPAN on 2/17/2017.
 */
public class StringTest {
    public static void main(String[] args){

        UseOfStringMethods obj=new UseOfStringMethods();

        obj.useOfcharAT();

        obj.useOfCodePointAt();

        obj.useOfCodePointBefore();

        obj.useOfCodePointCount();

        obj.useOfCompareTo("cheat","check");

        obj.useOfCompareToIgnoreCase("Good","GOOD");

        obj.useOfConcat("Virat","Kohli");

        obj.useOfContains("this is the message","message");

        String str1="This is a String.";
        obj.useOfEquals(str1);

        obj.useOfGetChars("Type whatever you want and as long as you want");

        obj.useOfIndexOf(str1,' ');// space character

        //use of isEmpty()
        String str2="";
        System.out.println(str2.isEmpty());

        System.out.println(str1.substring(4));
        //assignments
        System.out.println(StringAssignments.clubbedStringUsingFirstLetters("write something meaningful"));

        System.out.println("Reversed message : "+StringAssignments.reverseString("This message will reverse"));

        System.out.println("Checking if EmaiId valid or not : "+StringAssignments.isEmailValid("ExamplE@Yahoo.COM"));

        System.out.println("Checking if Palindrome or not : "+StringAssignments.isPalindrome("pop"));

        System.out.println("Checking if Anagram or not : "+StringAssignments.isAnagram("Army","Mary")); //case insensitive

        System.out.println("Word after removing specified character : "+StringAssignments.removeChar("Mississippi",'s'));

        StringAssignments.splitString("A,b,c,d,e");

        String[] strArray=StringAssignments.returnString("India",5);
        for (int i=0;i<strArray.length;i++)
            System.out.print("\n"+(i+1)+" : " +strArray[i]+"\t");

    }

}
