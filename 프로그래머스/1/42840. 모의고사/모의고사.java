import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList list = new ArrayList<>();

            int[] first = {1, 2, 3, 4, 5};
            int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            ArrayList<Integer> one = new ArrayList<>();
            ArrayList<Integer> two = new ArrayList<>();
            ArrayList<Integer> three = new ArrayList<>();

            int[] scores =  new int[3];

            for(int i = 0; i < answers.length; i++) {
                one.add(first[i%first.length]);
                two.add(second[i%second.length]);
                three.add(third[i%third.length]);
            }

            for(int i = 0; i < answers.length; i++) {
                if(one.get(i)==answers[i]) {
                    scores[0]++;
                }
                if(two.get(i)==answers[i]) {
                    scores[1]++;
                }
                if(three.get(i)==answers[i]) {
                    scores[2]++;
                }
            }

            int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

            for (int i = 0; i < scores.length; i++) {
                if (scores[i] == maxScore) {
                    list.add(i + 1);
                }
            }

            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = (int) list.get(i);
            }        
        return answer;
    }
}