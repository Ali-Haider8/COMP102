package Other;

import java.util.List;
import java.util.Arrays;

public class ForEachLoop {
    void main() {
        // example 1
        /*List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        for (Integer x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }*/

        // example 2
        /*List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }*/

        // example 3
        /*Student[] students = {
                new Student(1, "Julie"),
                new Student(3, "Adam"),
                new Student(2, "Robert")
        };

        for (Student student : students) {
            System.out.print(student);
            System.out.print(",");
        }*/


    }

    // example 3
    /*class Student {
        int rollNo;
        String name;

        Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        @Override
        public String toString() {
            return "[ " + this.rollNo + ", " + this.name + " ]";
        }
    }*/
}
