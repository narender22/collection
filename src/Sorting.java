// class to apply selection sort
class SelectionSort{
//    repeatedly finding the minimum element from unsorted part and putting it at the beginning.
    public static void sort(int[] arr){
        int n=arr.length;
//        one by one move to boundary of unsorted sub array
        for (int i=0; i<n-1; i++){

            int min_idx = i;
            for (int j=i+1; j < n; j++){
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

//            swap the found minimum element wth the first
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}

// class to apply bubble sort
class BubbleSort{
//    repeatedly swapping the adjacent elements if they are in the wrong order
    public static void sort(int[] arr){
        int n=arr.length;
        for (int i=0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

// class to apply Insertion sort
class InsertionSort{
//    Array is virtually sorted into sorted and unsorted parts
//    Values from unsorted part are picked and placed at correct position in the sorted part.
    public static void sort(int[] arr){
        int n=arr.length;
        for (int i=1; i < n; ++i){
            int key = arr[i];
            int j=i-1;

            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }
}

// class to apply merge sort
class MergeSort{
//    merge two sub-arrays of arr[]
//    First sub-array is arr[l…m]
//    Second array is arr[m+1..r]
    public static void merge(int[] arr, int l, int m, int r) {
//      Find sizes of two sub-arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

//        create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

//        copy data to temp arrays
        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

//        merge the temp arrays

//        initial indexes of first and second sub-array
        int i = 0, j = 0;

//        initial index of merged sub-array array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

//        copy remaining elements fo L{} if any
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void sort(int[] arr, int l, int r){
        if (l < r){
//            find the middle point
            int m=l+ (r-l)/2;

//            sort first and second halves
            sort(arr, l, m);
            sort(arr, m+1, r);

//            merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}

public class Sorting {
//    to print the contents of an int array
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr ={4,5,2,7,62,36,6,235,24,1,34,1,9};

//        to apply Insertion sort use:
//        InsertionSort.sort(arr);

//        to apply Selection sort use:
//        SelectionSort.sort(arr);

//        to apply Bubble sort use:
//        BubbleSort.sor(arr);

//        to apply merge sort use:
        MergeSort.sort(arr, 0, arr.length-1);

//        print array after sorting
        System.out.println("sorted array");
        printArray(arr);

    }
}
