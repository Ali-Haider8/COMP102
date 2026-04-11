package L1;
// Q2: Write java codes to create array with any five integer items { 5,4,2,1}
//then sorting array in ascending order.
public class SortArray {

    static void main(String[] args) {

        int[] a = {5, 4, 2, 1};

        int swap;
        for (int i = 0; i < a.length; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[i] > a[j]) {
                    swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
            }
        }

        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }
}
