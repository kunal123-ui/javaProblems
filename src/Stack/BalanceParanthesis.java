package Stack;

import java.util.Stack;
class BalanceParanthesis {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String[] test = {
                "(){}[]",
                "({[]})",
                "((})",
                "([)]",
                "((()))",
                "((("
        };
        for (String s : test) {
            if (isBalanced(s))
                System.out.println(s + "Balanced");
            else
                System.out.println(s + "Not Balanced");
        }
    }


}
