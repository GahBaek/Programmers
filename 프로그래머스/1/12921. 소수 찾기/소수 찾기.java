import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] pure = new int[n + 1];
        
        Arrays.fill(pure, 1);
        pure[0] = 0;
        pure[1] = 0;

        for (int i = 2; i * i <= n; i++) {
            if (pure[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    pure[j] = 0;
                }
            }
        }
        
        for (int check: pure){
                if (check == 1){
                    answer++;
                }
            }        return answer;
    }
}