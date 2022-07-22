/**
 * class to apply selection sort
 */
class SelectionSort {
    /*
        apply selection sort by repeatedly finding the minimum element from unsorted part
        and putting it at the beginning.
     */
    void sort(int[] array) {
//        integer len with a value as length of array
        int len = array.length;
//        one by one move to boundary of unsorted sub array
        for (int i = 0; i < len - 1; i++) {

            int minIdx = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[minIdx])
                    minIdx = j;
            }

//            swap the found minimum element wth the first
//            temporary variable temp for swapping
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
}

// class to apply bubble sort
class BubbleSort {
    /*
        we can apply bubble sort by repeatedly swapping the adjacent
        elements if they are in the wrong order
     */
    public static void sort(int[] array) {
//        integer len with a value as length of array
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
//                swap the variable if condition is true
                if (array[j] > array[j + 1]) {
//                    temporary integer temp for swapping
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

// class to apply Insertion sort
class InsertionSort {
    /*
        in case of insertion sort
        array is virtually sorted into sorted and unsorted parts
        values from unsorted part are picked and placed at correct position in the sorted part.
     */
    public static void sort(int[] array) {
//        integer len with a value as length of array
        int len = array.length;
        for (int i = 1; i < len; ++i) {
//            store the selected variable in an integer variable named selected
            int selected = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > selected) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = selected;
        }
    }
}

// class to apply merge sort
class MergeSort {
/*
    to apply merge sort
    merge two sub-arrays of arr[]
    First sub-array is arr[l…m]
    Second array is arr[m+1..r]
 */

    /**
     * method to merge arrays
     */
    public static void merge(int[] arr, int left, int middle, int right) {
//      Find sizes of two sub-arrays to be merged
        int size1 = middle - left + 1;
        int size2 = right - middle;

//        create temp arrays
        int[] tempLeft = new int[size1];
        int[] tempRight = new int[size2];

//        copy data to temp arrays
        System.arraycopy(arr, left, tempLeft, 0, size1);
        for (int j = 0; j < size2; ++j)
            tempRight[j] = arr[middle + 1 + j];

//        merge the temp arrays

//        initial indexes of first and second sub-array
        int i = 0, j = 0;

//        initial index of merged sub-array array
        int k = left;
        while (i < size1 && j < size2) {
            if (tempLeft[i] <= tempRight[j]) {
                arr[k] = tempLeft[i];
                i++;
            } else {
                arr[k] = tempRight[j];
                j++;
            }
            k++;
        }

//        copy remaining elements fo L{} if any
        while (i < size1) {
            arr[k] = tempLeft[i];
            i++;
            k++;
        }

        while (j < size2) {
            arr[k] = tempRight[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] array, int left, int right) {
        if (left < right) {
//            find the middle point
            int middle = left + (right - left) / 2;

//            sort first and second halves
            sort(array, left, middle);
            sort(array, middle + 1, right);

//            merge the sorted halves
            merge(array, left, middle, right);
        }
    }
}

public class Sorting {
    /**
     * to print the contents of an int array
      */
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 7, 62, 36, 6, 235, 24, 1, 34, 1, 9};

//        to apply Insertion sort use:
//        InsertionSort.sort(arr);

//        to apply Selection sort use:
//        SelectionSort.sort(arr);

//        to apply Bubble sort use:
//        BubbleSort.sor(arr);

//        to apply merge sort use:
        MergeSort.sort(arr, 0, arr.length - 1);

//        print array after sorting
        System.out.println("sorted array");
        printArray(arr);

    }
}
