package L3.HW;

/*
Source: 3- Java Methods.pdf
H.W:- Write java program to pass array x[5] as integer values ,
then store items of array from index 2 to end of array in new array
xnew[]; then return xnew to main method.
*/

public class PassArrayAndStoreInArrayMethod {

    static int[] storeInNewArray(int[] arr) {
        int[] xnew = new int[arr.length - 2];
        int counter = 2;
        for (int i = 0; i < xnew.length; i++) {
            xnew[i] = arr[counter];
            counter++;
        }

        return xnew;
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        for (int element : storeInNewArray(x)) {
            System.out.print(element + " ");
        }

    }
}
