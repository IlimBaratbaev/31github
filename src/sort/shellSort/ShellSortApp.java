package sort.shellSort;

public class ShellSortApp {
    public static void main(String[] args) {
        int maxSize = 10;
        ArraySh arraySh = new ArraySh(maxSize);
        for (int i = 0; i < maxSize; i++) {
            arraySh.insert((long) (Math.random() * 99));
        }
        arraySh.display();
        arraySh.shellSort();
        arraySh.display();
    }
}
