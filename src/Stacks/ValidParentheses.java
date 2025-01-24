package Stacks;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "([{}])";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        s = s.replaceAll("[^({\\[]}\\)]", ""); //not necessary but a bit cleaner imo
        char [] tab = s.toCharArray();

        for (char c: tab){
            if(!stack.isEmpty()) { //can be upgraded with a switch case for readability
                char charToMatch = stack.peek();
                if (c == ')' && charToMatch == '(') {
                    stack.pop();
                    continue;
                } else if (c == '}' && charToMatch == '{') {
                    stack.pop();
                    continue;
                } else if (c == ']' && charToMatch == '[') {
                    stack.pop();
                    continue;
                }
            }
            stack.add(c);
        }

        return stack.isEmpty();
    }

}
