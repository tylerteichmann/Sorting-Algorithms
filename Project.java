/**
 * Project
 */
public class Project {

    public static void main(String[] args) {
        
        // for (int value : arr) {
            //     System.out.print(value + ", ");
            // }
            // System.out.println();
            

        double sum = 0;
        for (int i = 0; i < 20; i++){
            int[] arr = { 3, 54, 21, 1, 58, 87, 89, 9000, 2, 1 };

            long startTime = System.nanoTime();
            BubbleSort(arr);
            long endTime = System.nanoTime();

            sum = sum + ((endTime - startTime));
        }
        System.out.println("Bubble Sort Average: " + sum / 20);


        sum = 0;
        for (int i = 0; i < 20; i++){
            int[] arr = { 3, 54, 21, 1, 58, 87, 89, 9000, 2, 1 };

            long startTime = System.nanoTime();
            SelectionSort(arr);
            long endTime = System.nanoTime();

            sum = sum + ((endTime - startTime));
        }
        System.out.println("Selection Sort Average: " + sum / 20);


        sum = 0;
        for (int i = 0; i < 20; i++){
            int[] arr = { 3, 54, 21, 1, 58, 87, 89, 9000, 2, 1 };

            long startTime = System.nanoTime();
            InsertionSort(arr);
            long endTime = System.nanoTime();

            sum = sum + ((endTime - startTime));
        }
        System.out.println("Insertion Sort Average: " + sum / 20);

        sum = 0;
        for (int i = 0; i < 20; i++){
            int[] arr = { 3, 54, 21, 1, 58, 87, 89, 9000, 2, 1 };

            long startTime = System.nanoTime();
            MergeSort(arr);
            long endTime = System.nanoTime();

            sum = sum + ((endTime - startTime));
            for (int value : arr) {
                System.out.print(value + ", ");
            }
            System.out.println();
        }
        System.out.println("Merge Sort Average: " + sum / 20);

    
    }

    // public static void AverageRuntime()

    // Bubble sort algorithm
    public static void BubbleSort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    // Selection sort algorithm
    public static void SelectionSort(int[] arr) {
        int min;

        for (int i = 0; i < arr.length; i++) {
            min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    // Insertion sort algorithm
    public static void InsertionSort (int[] arr) {
        // for (int i = 1; i < arr.length; i++) {
        //     for (int j = i - 1; j >= 0 && arr[j + 1] < arr[j]; j--) {
        //         int tmp = arr[j + 1];
        //         arr[j + 1] = arr[j];
        //         arr[j] = tmp;
        //     }
        // }

        int j;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];

            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }

            arr[j] = temp;
        }
    }

    public static void MergeSort (int[] arr) {
        int length = arr.length;

        if (length <= 1) {
            return;
        }

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        int l = 0; // index to keep track for our left array
        int r = 0; // index to keep track for our right array
        for (; l < length; l++) {
            if(l < mid){
                leftArray[l] = arr[l];
            } else {
                rightArray[r] = arr[l];
                r++;
            }
        }

        MergeSort(leftArray);
        MergeSort(rightArray);
        Merge(leftArray, rightArray, arr);
    }

    public static void Merge(int[] leftArray, int[] rightArray, int[] arr) {
        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;

        int i = 0, l = 0, r = 0;

        while (l < leftArraySize && r < rightArraySize) {
            if (leftArray[l] < rightArray[r]) {
                arr[i++] = leftArray[l++];
            } else {
                arr[i++] = rightArray[r++];
            }
        }

        while(l < leftArraySize){
            arr[i++] = leftArray[l++];
        }
        while(r < rightArraySize){
            arr[i++] = rightArray[r++];
        }
    }
}