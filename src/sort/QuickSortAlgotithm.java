package sort;


import java.util.Arrays;

public class QuickSortAlgotithm {
    public static void main(String[] args) {


        int [] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};


        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }
    public static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);
            quickSort(arr, from, divideIndex - 1);
            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rigthIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rigthIndex) {
            while(arr[leftIndex] < pivot ) {
                leftIndex++;
            }
            while(arr[rigthIndex] > pivot ) {
                rigthIndex--;
            }
            if (leftIndex <= rigthIndex) {
                swap(arr, rigthIndex, leftIndex);
                leftIndex++;
                rigthIndex--;
            }
        }
        return leftIndex;
    }
    private static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

}
