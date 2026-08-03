package String;
import java.util.*;

public class printDubValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            boolean visited = false;

            // Check if character is already processed
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    visited = true;
                    break;
                }
            }

            if (!visited) {
                int count = 0;

                // Count occurrences
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }

                // Print only duplicate characters
                if (count > 1) {
                    System.out.println(str.charAt(i) + " : " + count);
                }
            }
        }
    }
}