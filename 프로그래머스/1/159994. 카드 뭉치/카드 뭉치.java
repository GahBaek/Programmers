import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> goalQueue = new LinkedList<>();

            for (String card : goal) {
                goalQueue.add(card);
            }

            int one = 0, two = 0;
            while(!goalQueue.isEmpty()) {
                if(one < cards1.length&&cards1[one].equals(goalQueue.peek())) {
                    one++;
                    goalQueue.poll();
                }else if(two < cards2.length && cards2[two].equals(goalQueue.peek())) {
                    two++;
                    goalQueue.poll();
                }else{
                    answer = "No";
                    break;
                }
            }
        return answer;
    }
}