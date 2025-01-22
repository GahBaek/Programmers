import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder stringBuilder = new StringBuilder(s);

            for (int i = 0; i < s.length(); i++) {
                Stack<Character> stack = new Stack<>();
                boolean isValid = true;

            for (int j = 0; j < stringBuilder.length(); j++) {
                char c = stringBuilder.charAt(j);

                    if (c == '(' || c == '{' || c == '[') {
                        stack.push(c);
                    } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                }

                if (isValid && stack.isEmpty()) {
                    answer++;
                }
                char firstChar = stringBuilder.charAt(0);
                stringBuilder.deleteCharAt(0).append(firstChar);
            }
        return answer;
    }
}