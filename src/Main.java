import java.util.*;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var elements = new ArrayList<Integer>();
        int max = -1;

        for (int i = 0; i < 5; i++) {
            int el = scanner.nextInt();

            if (el > max) {
                max = el;
            }

            elements.add(el);
        
        }

        System.out.println("Largest element: " + max);
        scanner.close();
    }

}