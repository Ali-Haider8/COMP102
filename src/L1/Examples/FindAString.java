package L1.Examples;

// Q1: Write Java program to create array have 5 string items {Ali, Hassan ,
//Mohaamed, Jaafar}
//Then search for word Ali , if his name in array , print found if not print
//not found
public class FindAString {

    static void main(String[] args) {

        String[] names = {"Ali", "Hassan", "Jafar", "Mohamed"};

        int x = 0; // flag

        for (int i = 0; i < names.length; i++) {
            if (names[i] == "Ali") {
                x = 1;
                break;
            }
        }

        if (x == 1) System.out.println("Found");
        else System.out.println("Not Found");

    }
}
