import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        ArrayList<Character> letters = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            letters.add(s.charAt(i));
        }
        int c = 0;
        while(c < letters.size()){
            char temp = letters.get(c);
            for(int i = 0; i < n; i++) {
                if(temp == 'z') {
                    temp = '`';
                    temp ++;
                }else if(temp == ' ') {
                    temp = ' ';
                }else if(temp == 'Z') {
                    temp = '@';
                    temp ++;
                }else if(temp == 10){
                    break;
                }
                else {
                    temp ++;
                }
            }
            answer += String.valueOf(temp);
            c++;
        }
        return answer;
    }
}