package sort;

import java.util.Arrays;

public class MergeApp {
    public static void main(String[] args) {
        int[] arrayA = {24, 56, 83, 98};
        int[] arrayB = {7, 23, 47, 89, 90, 107};
        int[] arrayC = new int[arrayA.length + arrayB.length];
        merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
        System.out.println(Arrays.toString(arrayC));
    }
    public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
        int aDex = 0, bDex = 0, cDex = 0;
        while(aDex < sizeA && bDex < sizeB) {
            if(arrayA[aDex] < arrayB[bDex]) {
                arrayC[cDex++] = arrayA[aDex++];
            }
            else {
                arrayC[cDex++] = arrayB[bDex++];
            }
        }
        while (aDex < sizeA) {
            arrayC[cDex++] = arrayA[aDex++];
        }
        while (bDex < sizeB) {
            arrayC[cDex++] = arrayB[bDex++];
        }
    }
}
