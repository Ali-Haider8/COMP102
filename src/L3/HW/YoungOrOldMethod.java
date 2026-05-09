package L3.HW;

/*
5- Write java program to create method  Getpersoninfo (name , age) to get
information from main method, chekage() to check person young or old or
very old.

Source: 4- H.W Methods using Java 2025.pdf (page 1 of 1)
*/

public class YoungOrOldMethod {
    static void GetPersonInfo(String name, int age) {
        System.out.print("Ali is ");
        checkAge(age);
    }

    static void checkAge(int age) {
        if (age < 30)
            System.out.print("Young");
        else if (age < 65)
            System.out.print("Old");
        else if (age < 120)
            System.out.print("Very Old");
        else
            System.out.print("Invalid input!");
    }

    public static void main(String[] args) {
        String name = "Ali";
        int age = 20;
        GetPersonInfo(name, age);
    }
}
