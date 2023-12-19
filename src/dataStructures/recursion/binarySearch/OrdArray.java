package dataStructures.recursion.binarySearch;

public class OrdArray {
    private long[] array;
    private int nElems;

    public OrdArray(int max) {
        array = new long[max];
        this.nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        return recFind(searchKey, 0, nElems - 1);
    }

    private int recFind(long searchKey, int lowerBound, int upperBound) {
        int currIn = (lowerBound + upperBound) / 2;
        if (array[currIn] == searchKey) {
            return currIn;
        } else if (lowerBound > upperBound)
            return nElems;
        else {
            if (array[currIn] < searchKey)
                return recFind(searchKey, currIn + 1, upperBound);
            else
                return recFind(searchKey, lowerBound, currIn - 1);
        }
    }


    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (array[j] > value)
                break;
        }
        for (int i = nElems; i > j; i--) {
            array[i] = array[i - 1];
        }
        array[j] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
