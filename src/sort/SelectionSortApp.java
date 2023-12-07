package sort;

public class SelectionSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        SelectionSort arr = new SelectionSort(100);
        arr.insert(77);
        arr.insert(94);
        arr.insert(11);
        arr.insert(65);
        arr.insert(39);
        arr.insert(19);
        arr.insert(8);
        arr.insert(88);
        arr.display();
        arr.selectionSort();
        arr.display();
    }
}
