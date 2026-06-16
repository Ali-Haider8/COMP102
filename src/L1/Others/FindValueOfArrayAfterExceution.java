package L1.Others;

/*
5. Find the value of A[1] after execution of the following program.

int[] A = {0, 2, 4, 1, 3};
for(int i = 0; i < A.length; i++){
    A[i] = A[(A[i] + 3) % A.length];
}

a- 0    b- 1    c- 3


Source: final-exams-csklawat.pdf (page 7 of 11)
*/

public class FindValueOfArrayAfterExceution {

    public static void main(String[] args) {

        int[] A = {0, 2, 4, 1, 3};
        for (int i = 0; i < A.length; i++) {
            A[i] = A[(A[i] + 3) %A.length];
        }
        System.out.println("A[1]= " + A[1]); // 1

    }
}
