class Solution {
    public int solution(int a, int b, int n) {
        int newCoke =0;
        int answer =0;
            while(n >= a) {
                newCoke = n / a * b;
                n = n - (a*(n/a)) + newCoke;
                answer += newCoke;
            }
        return answer;
    }
}