package ModuleString;

/**
 * Created by PAPAN on 2/17/2017.
 */
public class UseOfStringMethods {

    //charAt(int index)-->Returns the char value at the specified index.
    String str1="This is a String.";
    String str2="This is another String.";

    public void useOfcharAT(){
        System.out.println(str1.charAt(6));
    }

    //codePointAt(int index)-->Returns the character (Unicode code point) at the specified index.
    public void useOfCodePointAt(){
        System.out.println(str1.codePointAt(6));
    }

    //codePointBefore(int index)-->returns character unicode before the index
    public void useOfCodePointBefore(){
        System.out.println(str1.codePointBefore(7));
    }

    //codePointCount(int beginindex,int endIndex)
    public void useOfCodePointCount(){
        System.out.println(str1.codePointCount(2,3));
    }

    //compareTo(String another string)-->compare two string lexicographically
    public void useOfCompareTo(String str1,String str2){
        //checking which string comes first in dictionary(alphabetically)
        if(str1.compareTo(str2)<0)
            System.out.println(str1+" comes lexicographically before "+str2+" in the dictionary");
        else if(str1.compareTo(str2)>0)
            System.out.println(str2+" comes lexicographically before "+str1+" in the dictionary");
        else
            System.out.println(str1+" & "+str2+" are equivalent");
    }

    //compareToIgnoreCase(String str)-->comparing two string by ignoring case differences
    public void useOfCompareToIgnoreCase(String str1,String str2){
        //checking whether meaning of two words same or not by ignoring case diff.
        if(str1.compareToIgnoreCase(str2)==0)
            System.out.println(str1+" & "+str2+" both are same words.");
        else
            System.out.println("Words are not same.");
    }

    //concat(String str)-->concading two string
    public void useOfConcat(String firstName,String lastName){
        //concating first name and last name
        System.out.println("Fullname : "+firstName.concat(" "+lastName));
    }

    //contains(CharSequence s)--> returns true only when the calling string contains same char sequence
    public void useOfContains(String msg,String findWord){
        //Searching of an word in the message
        if(msg.contains(findWord))
            System.out.println("Found the word...");
        else
            System.out.println("Not found");
    }

    //equals(Object anObject)-->compares the string object to the object
    public void useOfEquals(Object obj){
        if(str1.equals(obj))
            System.out.println("Both the objects referring to same memory location (i.e There hashcode is "+str1.hashCode()+")");
        else
            System.out.println("Object having different memory location");
    }

    //getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) -->
    // copies the char of specified range and store to the dst array from index dstBegin
    public void useOfGetChars(String str1){
        char[] array=new char[str1.length()];
        for (int i=0;i<array.length;i++){
            array[i]='-';
        }
        str1.getChars(3,16,array,7);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }

    //indexOf(char ch)--> returns the index of the first ch in the string
    public void useOfIndexOf(String msg,char ch){
        System.out.println("\nIndex of the character in the message : "+msg.indexOf(ch));
    }
}
