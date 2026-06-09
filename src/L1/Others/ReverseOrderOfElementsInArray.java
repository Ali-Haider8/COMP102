package L1.Others;

/*
Q5: Write down a Java program to reverse the order of elements in an array
example: A = {12, 0, 3, -4, 7} becomes A = {7, -4, 3, 0, 12}. (5 marks)

Source: final-exams-batool.pdf (page 2 of 6)
*/

public class ReverseOrderOfElementsInArray {

    public static void main(String[] args) {
        int[] arr = {12, 0, 3, -4, 7};

        int j = arr.length - 1;
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        for (int n : arr) System.out.print(n + " ");

    }
}
