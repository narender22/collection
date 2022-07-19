// program to apply methods on an array
public class ArraysProgram {
//    method to sort the contents of an array
    public static int[] sortMethod(int[] arr) {
//        program to sort an array
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

//    method to reverse an array
    public static int[] reverseMethod(int[] arr){
//        to reverse an array
        int[] nar=new int[arr.length];
        int l=arr.length;
        for (int j : arr) {
            nar[l - 1] = j;
            l = l - 1;
        }

        return nar;
    }

//    method to print the contents of an array
    public static void printMethod(int[] arr){
        for(int i:arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,21,35,6,2,34,6,21,3};
//      print the array before making any changes
        System.out.println("old array");
        printMethod(arr);

//        reverse the given array
        System.out.println();
        int[] reverar=reverseMethod(arr);

//        print the reversed array
        System.out.println("reversed array");
        printMethod(reverar);

        System.out.println();

//        print the array after sorting
        int[] sortarr=sortMethod(arr);
        System.out.println("sorted array");
        printMethod(sortarr);
    }
}
