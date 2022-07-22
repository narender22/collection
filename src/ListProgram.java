import java.util.ArrayList;
import java.util.List;
/*
 * List example program to check if a string is palindrome or not
 */

/**
 * define some methods to be applied to array
 */
class ArrayMethods{
/**
 * method to check if a string is palindrome or not
 */
    static void palindromeCheck(String string){
/*
        program to check if the given string is palindrome
 */
//        an array of type char
        char[] charArray=new char[string.length()];
//        integer len with value as size of string
        int len=string.length();
        while(len>0) {
            charArray[string.length() - len] = string.charAt(len - 1);
            --len;
        }
//        converting charArray to a new string
        String newString=new String(charArray);
/*
        print string if the sting is a palindrome with work palindrome
 */
        if (string.equals(newString)){
            System.out.println(charArray);
            System.out.println("palindrome");
        }
//        if the string is not a palindrome print not-palindrome
        else {
            System.out.println("not-palindrome");
        }
    }
}

class ListProgram {
    /**
     * main block
     */
    public static void main(String[] args) {
/*
        create a list of string to be checked for palindrome
 */
        List<String> palList = new ArrayList<>();
/*
        Add some stings in List to check for palindrome
 */
        palList.add("Narender");
        palList.add("AbccbA");
        palList.add("AbcddcBa");
        String[] array=palList.toArray(new String[0]);

/*
        show the strings from the list to be checked for palindrome
 */
        System.out.println("List");
        for(String i:array){
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Palindrome strings");

/*
       passing the strings to palindromeCheck method one by one
 */
        for(String i:array){
            ArrayMethods.palindromeCheck(i);
        }
    }
}
