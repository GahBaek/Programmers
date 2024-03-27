class Solution {
    public int solution(int n) {
        int sum = 0;
        int answer = 0, start = 0;
        for(int k = 1; k<n; k++) {
            for (int i = k; i < n; i++) {
                sum += i;
                if (sum >= n) {
                    if (sum == n) {
                        System.out.println(i);
                        answer += 1;
                    }
                    sum = 0;
                    break;
                }
            }
        }
        return answer+1;
    }
}