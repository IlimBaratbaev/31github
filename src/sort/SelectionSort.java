package sort;

public class SelectionSort {
    private long[] arr;
    private int nElems;
    public SelectionSort(int max) {
        arr = new long[max];
        nElems = 0;
    }
    public void insert(long num) {
        arr[nElems] = num;
        nElems++;
    }
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void selectionSort() {
        int min;
        for (int i = 0; i < nElems - 1; i++) {
            min = i;
            for (int j = i + 1; j < nElems; j++) {
                if (arr[min] > arr[j]) {
                    swap(min, j);
                }
            }
        }
    }
    public void swap(int one, int two) {
        long temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
