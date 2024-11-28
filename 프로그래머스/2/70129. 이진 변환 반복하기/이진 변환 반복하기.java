class Solution {
    public int[] solution(String s) {
       int zeroCount = 0;
        int convertingCnt = 0;
        
        while(s.length() != 1) {
            String remove = s.replace('0', ' ').trim().replace(" ", "");
            zeroCount += s.length() - remove.length();
            s = Integer.toBinaryString(remove.length());
            convertingCnt++;
        }
        int[] answer = {convertingCnt, zeroCount};
        return answer;
    }
}