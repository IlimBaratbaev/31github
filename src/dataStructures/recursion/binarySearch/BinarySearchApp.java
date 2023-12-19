package dataStructures.recursion.binarySearch;

public class BinarySearchApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray array = new OrdArray(maxSize);
        array.insert(72);
        array.insert(45);
        array.insert(34);
        array.insert(23);
        array.insert(87);
        array.insert(55);
        array.insert(67);
        array.insert(998);
        array.insert(656);
        array.insert(342);
        array.insert(222);
        array.display();
        int searchKey = 342;
        if (array.find(searchKey) != array.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
    }
}
