class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int lenT = t.length();
        int lenP = p.length();
        
        for (int i = 0; i <= lenT - lenP; i++) {
            String sub = t.substring(i, i + lenP);
            if (sub.compareTo(p) <= 0) {
                answer++;
            }
        }
        return answer;
    }
}