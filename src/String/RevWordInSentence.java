package String;

import java.util.Scanner;

class RevWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                revWord += word.charAt(j);
            }
            res += revWord + " ";
        }
        System.out.println(res.trim());
    }
}