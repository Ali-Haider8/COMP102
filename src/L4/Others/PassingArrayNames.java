package L4.Others;

/*
Q5: Write java program using passing array names[] to get the following output

Output:
ali : Ali
mohammed: Mohammed
jaafar: Jaafar
Ali  Jaafar , Mohammed

Source: All-Questions-Second-Course.pdf (page 14 of 24)
*/

public class PassingArrayNames {

    static String[] makeFirstCharUpper(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String firstLetter = arr[i].substring(0, 1).toUpperCase();
            String rest = arr[i].substring(1);
            System.out.println(arr[i] + ": " + firstLetter + rest);
            arr[i] = firstLetter + rest;
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] names = {"ali", "mohammed", "jaafar"};
        names = makeFirstCharUpper(names);
        System.out.println(names[0] + " " + names[1] + " , " + names[2]);
    }



}
