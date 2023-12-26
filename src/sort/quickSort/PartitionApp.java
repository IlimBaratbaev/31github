package sort.quickSort;

public class PartitionApp {
    public static void main(String[] args) {
        int maxSize = 16;
        ArrayPar arr = new ArrayPar(maxSize);
        for (int i = 0; i < maxSize; i++) {
            arr.insert((int) (Math.random() * 199));
        }
        arr.display();
        long pivot = 99;
        System.out.println("Pivot is: " + pivot);
        int size = arr.size();
        int partDex = arr.partition(0, size - 1, pivot);
        System.out.println("Partition is at index " + partDex);
        arr.display();
    }
}
