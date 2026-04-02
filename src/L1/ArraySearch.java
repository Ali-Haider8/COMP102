package L1;

import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        int[] numbers = {5,2,7,4,10};

        int i, num, flag=0;

        Scanner s= new Scanner(System.in);

        System.out.print("Ente the element you search for: ");
        num = s.nextInt();
        s.close();

        for (i=0;i< numbers.length;i++){
            if (num==numbers[i]){
                flag=1;
                break;
            }
        }

        if (flag==1) System.out.println("The element Found at position: "+i);
        else System.out.println("The element not found");

    }
}
