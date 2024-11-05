class Solution {
    public String solution(int n) {
        String answer = "";
        char poly[] = {'수', '박'};
        for(int i = 0; i < n; i ++){
            if(i%2 == 0)
                answer += poly[0];
            else 
                answer += poly[1];
        }
        return answer;
    }
}