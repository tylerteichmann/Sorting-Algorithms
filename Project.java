/**
 * Project
 */
public class Project {

    public static void main(String[] args) {
        int[] arr = { 3, 54, 21, 1, 58, 87, 89, 9000, 2, 1 };

        for (int value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();

        BubbleSort(arr);

        for (int value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public static void BubbleSort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] > arr[j+ 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}