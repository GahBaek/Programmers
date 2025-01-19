class Solution {
    public String solution(int a, int b) {
        int[] Month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int total = b;
        for (int i = 0; i < a - 1; i++) {
            total += Month[i];
        }

        String answer = days[total % 7];
        return answer;
    }
}