import java.util.*;

public class Main {

    private static int findBiggestElement(ArrayList<Integer> arr) {
        int max = -1;

        for (Integer el : arr) {
            if (el > max) {
                max = el;
            }
        }

        return max;
    }

    private static int findSmallestElement(ArrayList<Integer> arr) {
        int min = Integer.MAX_VALUE;

        for (Integer el : arr) {
            if (el < min) {
                min = el;
            }
        }

        return min;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var elements = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            int el = scanner.nextInt();
            elements.add(el);
        }

        int max = findBiggestElement(elements);
        System.out.println("Largest element: " + max);
        int smallest = findSmallestElement(elements);
        System.out.println("Smallest element: " + smallest);
        scanner.close();
    }
}