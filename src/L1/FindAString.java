package L1;

public class FindAString {

    public static void main(String[] args) {

        String[] names = {"Ali", "Hassan", "Jafar", "Mohamed"};

        int x = 0; // flag

        for (int i = 0; i < names.length; i++) {
            if (names[i] == "Ali") {
                x = 1;
            }
        }

        if (x == 1) System.out.println("Found");
        else System.out.println("Not Found");

    }
}
