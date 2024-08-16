import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] num = new int[progresses.length];
        for(int i = 0; i< progresses.length; i++){
            for(int j = 0; j< 99;  j++){
                if(100 - progresses[i] - j*speeds[i] <= 0){
                    num[i] = j;
                    break;
                }
            }
        }
        int[] tempAnswer = new int[progresses.length];
        int count = 1;
        int index = 0;
        int currentMax = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] <= currentMax) {
                count++;
            } else {
                tempAnswer[index++] = count;
                count = 1;
                currentMax = num[i];
            }
        }
        tempAnswer[index++] = count;
        
        int[] answer = Arrays.copyOf(tempAnswer, index);
        return answer;
    }
}