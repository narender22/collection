public class ArraysProgram {
    public static int[] srt(int arr[]) {
//        program to sort an array
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] rever(int arr[]){
//        to reverse an array
        int[] nar=new int[arr.length];
        int l=arr.length;
        for(int i = 0; i < arr.length; i++){
            nar[l - 1] = arr[i];
            l = l - 1;
        }

        return nar;
    }

    public static void main(String[] args) {
        int arr[]= {5,21,35,6,2,34,6,21,3};

        System.out.println("old array");
        for(int i:arr){
            System.out.print(i + " ");
        }

        System.out.println();
        int[] reverar=rever(arr);
        System.out.println("reversed array");
        for(int i:reverar){
            System.out.print(i + " ");
        }

        System.out.println();
        int[] sortarr=srt(arr);
        System.out.println("sorted array");
        for(int i:sortarr){
            System.out.print(i + " ");
        }

    }
}
