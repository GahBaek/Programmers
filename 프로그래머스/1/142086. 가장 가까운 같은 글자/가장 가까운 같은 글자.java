import java.util.*;
class Solution {
    public int[] solution(String s) {
         int[] answer = new int[s.length()];
        ArrayList<String> list = new ArrayList<>();

        list.add(s.substring(0,1));
        answer[0] = -1;

        for(int i = 1; i < s.length(); i++) {
            String temp = s.substring(i,i+1);
            for(int j = list.size()-1; j >= 0; j--) {
                if(temp.equals(list.get(j))){
                    answer[i] = i - j;
                    break;
                }else{
                    answer[i] = -1;
                }
            }
            list.add(temp);
        }
        return answer;
    }
}