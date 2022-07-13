class SelectionSort{
//    repeatedly finding the minimum element from unsorted part and putting it at the beginning.
    public static void sort(int arr[]){
        int n=arr.length;
//        one by one move to boundary of unsorted subarray
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

class BubbleSort{
//    repeatedly swapping the adjacent elements if they are in the wrong order
    public static void sort(int arr[]){
        int n=arr.length;
        for (int i=0; i < n-1; i++)
            for(int j=0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}

class InsertionSort{
//    Array is virtually sorted into sorted and unsorted parts
//    Values from unsorted part are picked and placed at correct position in the sorted part.
    public static void sort(int arr[]){
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

public class Sorting {
    public static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={4,5,2,7,62,36,6,235,24,1,34,1,9};
        InsertionSort.sort(arr);
        System.out.println("sorted array");
        printArray(arr);

    }

}
