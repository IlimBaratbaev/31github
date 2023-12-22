package dataStructures.recursion.mergeSort;

public class MergeSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DArray array = new DArray(maxSize);
        for (int i = 0; i < 15; i++) {
            array.insert((long) (Math.random() * 49 + 1));
        }
        array.display();
        array.mergeSort();
        array.display();
    }
}
