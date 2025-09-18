package week6.binary_search;

public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {

        for (int i : array) {
            if (i == searchedValue) {
                System.out.println("Value " + searchedValue + " is in the array");
                return true;
            }
        }
        System.out.println("Value " + searchedValue + " is not in the array");
        return false;

    }
}
