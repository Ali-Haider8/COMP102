package L2.Examples;

class DeclaringInitizingRaggedArray {

    static void main() {

        char[][] animals = {
                {'M', 'O', 'N', 'K', 'E', 'Y'},
                {'C', 'A', 'T'},
                {'B', 'I', 'R', 'D'}
        };

        for (int row = 0; row < animals.length; row++) {
            for (int col = 0; col < animals[row].length; col++) {
                System.out.print(animals[row][col]);
            }
            System.out.println();
        }

    }
}
