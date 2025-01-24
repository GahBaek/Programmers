import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> type = new HashMap<>();
            for(int i = 0; i < clothes.length; i++) {
                if (type.containsKey(clothes[i][1])) {
                    type.put(clothes[i][1], type.getOrDefault(clothes[i][1], 1) + 1);
                }else{
                    type.put(clothes[i][1], 1);
                }
            }

            Integer[] count = type.values().toArray(new Integer[0]);
                for(int i = 0; i < count.length; i++) {
                    answer *= count[i] +1;
                }
                answer -= 1;
        return answer;
    }
}