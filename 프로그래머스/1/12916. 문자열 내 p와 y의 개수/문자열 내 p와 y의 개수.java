class Solution {
    boolean solution(String s) {
            System.out.println(s);
        boolean answer = true;
    int y = 0;
    int p = 0;
    for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'y'||ch=='Y') {
                y++;
            } else if (ch == 'p'||ch=='P') {
                p++;
            }
        }
    if(y != p) {
    	answer = false;
    }
        return answer;
    }
}