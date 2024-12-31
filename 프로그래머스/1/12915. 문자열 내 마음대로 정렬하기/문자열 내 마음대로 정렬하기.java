import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = sortStrings(strings, n);
        return answer;
    }
    public static String[] sortStrings(String[] strings, int n) {
            Arrays.sort(strings, (s1, s2) -> {
                if (s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2);
                }
                return Character.compare(s1.charAt(n), s2.charAt(n));
            });
            return strings;
        }
}