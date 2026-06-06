package L4.Others;

/*
Q1: Write java program to create method spilt(S1) to split string in two parts.
1- Pass string from main method S1 = "I would like to eat KFC"
2- return results s1, s2 to main method

Source: All-Questions-Second-Course.pdf (page 14 of 24)
*/

public class WouldLikeToEatKFC {

    static String[] split(String s1) {
        String part1 = s1.substring(0, 16);
        String part2 = s1.substring(16);
        return new String[]{part1, part2};
    }

    public static void main(String[] args) {
        String S1 = "I would like to eat KFC";
        String[] result = split(S1);
        S1 = result[0];
        String S2 = result[1];
        System.out.println("S1: " + S1);
        System.out.println("S2: " + S2);
    }

}
