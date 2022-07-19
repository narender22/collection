import java.util.ArrayList;
import java.util.List;
// define some methods to be applied to array
class ArrayMethods{
//    method to check if a string is palindrome or not
    public static void palindromeCheck(String str){
//        program to check if the given string is palindrome
        char[] n=new char[str.length()];
        int i=str.length();
        while(i>0) {
            n[str.length() - i] = str.charAt(i - 1);
            --i;
        }
        String s=new String(n);
        if (str.equals(s)){
            System.out.println(n);
            System.out.println("palindrome");
        }
    }
}

public class ListProgram {
    public static void main(String[] args) {
//        create a list of string to be checked for palindrome
        List<String> palList = new ArrayList<>();
//        Add some stings in List to check for palindrome
        palList.add("Narender");
        palList.add("AbccbA");
        palList.add("AbcddcBa");
        String[] array=palList.toArray(new String[0]);

//        show the contents of the list
        System.out.println("List");
        for(String i:array){
            System.out.println(i);
        }
        System.out.println();
//        check the strings for palindrome by passing it to the class ArrayMethod's method palindromeCheck
        System.out.println("Palindrome strings");
        for(String i:array){
            ArrayMethods.palindromeCheck(i);
        }
    }
}
