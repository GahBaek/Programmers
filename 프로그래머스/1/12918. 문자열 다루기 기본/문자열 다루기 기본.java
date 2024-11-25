class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        if(len == 4 || len == 6){
            for(int i = 0; i < len; i++) {
                if(s.charAt(i) > '9' || s.charAt(i) < '0') {
                    answer = false;
                    break;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }
}