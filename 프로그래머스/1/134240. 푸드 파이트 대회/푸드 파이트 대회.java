import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i]/2; j++) {
                list.add(i);
            }
        }

        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        answer += "0";
        for (int i = list.size()-1; i >=0; i--) {
            answer += list.get(i);
        }
        return answer;
    }
}