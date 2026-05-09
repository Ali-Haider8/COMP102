package L3;

/*
Q2: Create a class called Invoice, this class have

1- Create array items[] = { 1:sugar , 2:Tea , 3:rice }

2- Create array called prices
   1    200
   2    400
   3    600

3- Find Maximum and minimum price in second column

4- Create method FindKey(items, prices, Key) to find key="Tea", then print its price from prices array.


Source: final-exams-csklawat.pdf (page 10 of 11)
*/

public class Invoice {


    public static void main(String[] args) {
        String[] items = {"sugar", "Tea", "rice"};
        int[] prices = {200, 400, 600};

        int maxPrice = prices[0];
        int indexMaxPrice = 0;
        int minPrice = prices[2];
        int indexMinPrice = 0;
        for (int i = 0; i < items.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexMaxPrice = i;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                indexMinPrice = i;
            }
        }
        System.out.println("Max Price: " + maxPrice + " for item: " + items[indexMaxPrice]);
        System.out.println("Min Price: " + minPrice + " for item: " + items[indexMinPrice]);

        FindKey(items, prices, "Tea");
    }

    static void FindKey(String[] items, int[] prices, String key) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(key)) {
                System.out.println("Price for " + key + " is: " + prices[i]);
            }
        }
    }
}
