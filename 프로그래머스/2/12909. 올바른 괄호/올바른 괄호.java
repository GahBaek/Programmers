import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        ArrayList<String> e = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            e.add(s.substring(i, i+1));
        }

        Stack<String> k = new Stack<>();
        for(String i : e) {
            if(i.equals("(")) {
                k.push(i);
            } else if(i.equals(")")) {
                if(k.empty() || !k.pop().equals("(")) {
                    answer = false;
                    break;
                }
            }
        }

        if(!k.empty()) {
            answer = false;
        }

        return answer;
    }
}