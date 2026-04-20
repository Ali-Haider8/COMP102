package L2.HW;

import java.util.Scanner;

class ElementOccurrences2DArray {

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter cols: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // حساب التكرار
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int current = arr[i][j];
                int count = 0;
                boolean countedBefore = false;

                // تحقق هل هذا العنصر تم حسابه سابقاً
                for (int x = 0; x < rows; x++) {
                    for (int y = 0; y < cols; y++) {
                        if (arr[x][y] == current) {
                            if (x < i || (x == i && y < j)) {
                                countedBefore = true;
                            }
                        }
                    }
                }

                // إذا لم يُحسب سابقاً → احسبه
                if (!countedBefore) {
                    for (int x = 0; x < rows; x++) {
                        for (int y = 0; y < cols; y++) {
                            if (arr[x][y] == current) {
                                count++;
                            }
                        }
                    }
                    System.out.println(current + " -> " + count);
                }
            }
        }

    }
}
