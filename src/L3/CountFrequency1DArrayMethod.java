package L3;

/*
Source:  (page 1 of 1)
*/

public class CountFrequency1DArrayMethod {

    static void countFrequency(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean isVisited = false;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    isVisited = true;
                    break;
                }
            }
            if (isVisited) continue;

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) count++;
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        countFrequency(arr);
    }
}
/*
i=0 (arr[0]=1): Looks backward (no elements before). Not visited → print 1 -> 1
i=1 (arr[1]=2): Looks backward at arr[0]=1. Not equal. Not visited → print 2 -> 2
i=2 (arr[2]=2): Looks backward at arr[1]=2. Found match! isVisited=true → skip (don't print)
i=3 (arr[3]=3): Looks backward at arr[0,1,2]. No match. Not visited → print 3 -> 3
i=4 (arr[4]=3): Looks backward at arr[3]=3. Found match! isVisited=true → skip
i=5 (arr[5]=3): Looks backward at arr[3,4]=3. Found match! isVisited=true → skip
*/