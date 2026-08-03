
package String;
import java.util.*;

public class PrintUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            boolean visited = false;

            // Check if character was already counted
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    visited = true;
                    break;
                }
            }
            if (!visited) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                System.out.print(str.charAt(i) +""+ count+ " " );
            }
        }
    }
}