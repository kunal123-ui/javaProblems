package String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("String.Anagram");
        else
            System.out.println("Not String.Anagram");
    }
}


/* method 2


public class Main {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("Not String.Anagram");
            return;
        }

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        boolean anagram = true;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                anagram = false;
                break;
            }
        }

        if (anagram)
            System.out.println("String.Anagram");
        else
            System.out.println("Not String.Anagram");
    }
}

*/
