package L2;

class Initialize2DArray {

    static void main() {
        int[][] A = {
                {11, -25, 4, 77},
                {-21, 55, 43, 11}
        }; // This creates and initializes a 2D array with 2 rows and 4 columns

        int[][] a = new int[2][4]; // save as above
        // Initialize first row of values
        a[0][0] = 11;
        a[0][1] = -25;
        a[0][2] = 4;
        a[0][3] = 77;

        // Initialize second row of values
        a[1][0] = -21;
        a[1][1] = 55;
        a[1][2] = 43;
        a[1][3] = 11;
    }
}
