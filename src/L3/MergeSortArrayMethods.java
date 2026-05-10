package L3;

/*
Q3: Write java program to create method MerregArray(int A1[], int A2[]) and
create Sortarray(int merregarray[]), let A1[4], A2[4]
1- Return result as one array to main method.
2- Sort result using Sortarray(int MergedArray[]).

Source: All-Questions-Second-Course.pdf (page 22 of 24)
*/

public class MergeSortArrayMethods {

    static int[] MergeArray(int[] A1, int[] A2) {
        int arrSize = A1.length + A2.length;
        int[] A3 = new int[arrSize];

        for (int i = 0; i < A1.length; i++) {
            A3[i] = A1[i];
            A3[i + 4] = A2[i];
        }

        return A3;
    }

    static int[] SortArray(int[] mergeArray) {
        int swap;
        for (int i = 0; i < mergeArray.length; i++) {
            for (int j = 0; j < mergeArray.length; j++) {
                if (mergeArray[i] < mergeArray[j]) {
                    swap = mergeArray[i];
                    mergeArray[i] = mergeArray[j];
                    mergeArray[j] = swap;
                }
            }
        }
        return mergeArray;
    }


    public static void main(String[] args) {
        int[] A1 = {5, 3, 8, 4};
        int[] A2 = {1, 2, 6, 7};
        int[] A3 = SortArray(MergeArray(A1, A2));
        for (int element : A3) System.out.print(element + " ");
    }
}
