package search;

public class BinarySearch {

    static boolean search(int[] array, int start, int end, int value) {
        int m = (end + start) / 2;

        if (array[m] == value) {
            return true;
        }

        if (m < 1 || m == array.length - 1) {
            return false;
        }


        if (array[m] > value) {
            return search(array, 0, m - 1, value);
        } else {
            return search(array, m + 1, end, value);
        }

    }


    public static void main(String[] args) {

        int[] array = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println(search(array, 0, array.length - 1, 2));
        System.out.println(search(array, 0, array.length - 1, 212));
        System.out.println(search(array, 0, array.length - 1, 8));
        System.out.println(search(array, 0, array.length - 1, 11));
        System.out.println(search(array, 0, array.length - 1, 12));
        System.out.println(search(array, 0, array.length - 1, 13));
        System.out.println(search(array, 0, array.length - 1, 14));
        System.out.println(search(array, 0, array.length - 1, 15));
        System.out.println(search(array, 0, array.length - 1, 16));
        System.out.println(search(array, 0, array.length - 1, 17));
        System.out.println(search(array, 0, array.length - 1, 18));
        System.out.println(search(array, 0, array.length - 1, 19));
        System.out.println(search(array, 0, array.length - 1, 20));
        System.out.println(search(array, 0, array.length - 1, 21));

    }
}
