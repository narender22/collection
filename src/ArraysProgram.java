/**
 * program to apply methods on an array
  */
public class ArraysProgram {
/**
 * method to sort the contents of an array
 */
    static int[] sortMethod(int[] array) {
        /*
         * method to sort an array
         */
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {

//                temporary variable for switching values.
                int temp;
//                switching 2 variables
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    /**
     * method to reverse an array
     */
    static int[] reverseMethod(int[] array){
//        another array of same size to store sorted array

        int[] newArray=new int[array.length];
        int l=array.length;
        for (int j : array) {
            newArray[l - 1] = j;
            l = l - 1;
        }
        return newArray;
    }

    /**
     *  method to print the contents of an array
     */
    static void printMethod(int[] array){
        for(int i:array){
            System.out.print(i + " ");
        }
    }

    /**
     * main method
     */
    public static void main(String[] args) {
/*
        some array for testing methods.
 */
        int[] array = {5,21,35,6,2,34,6,21,3};

/*
      print the array before making any changes
 */
        System.out.println("old array");
        printMethod(array);

        System.out.println();

/*
        reverse the given array
 */
        int[] reverar=reverseMethod(array);

/*
        print the reversed array
 */
        System.out.println("reversed array");
        printMethod(reverar);

        System.out.println();

/*
      sorting the given array
 */
        int[] sortarr=sortMethod(array);

        /*
         print the array after sorting
         */
        System.out.println("sorted array");
        printMethod(sortarr);
    }
}
