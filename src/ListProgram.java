import java.util.ArrayList;
import java.util.List;

class ArrayMethods{
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
        List<String> palList = new ArrayList<>();
        palList.add("Narender");
        palList.add("AbccbA");
        palList.add("AbcddcBa");
        String[] array=palList.toArray(new String[0]);

        System.out.println("List");
        for(String i:array){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Palindrome strings");
        for(String i:array){
            ArrayMethods.palindromeCheck(i);
        }
    }
}
