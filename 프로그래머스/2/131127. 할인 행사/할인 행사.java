import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> discountCnt = new HashMap<>();
            HashMap<String, Integer> wantCnt = new HashMap<>();

            for(int i = 0; i < want.length; i++) {
                wantCnt.put(want[i], number[i]);
            }

            int i = 0;
            while(i + 10 <= discount.length) {
                if(wantCnt.get(discount[i]) != null) {
                    for(int j = 0; j < 10; j++) {
                        discountCnt.put(discount[i+j], discountCnt.getOrDefault(discount[i+j], 0) + 1);
                    }
                    if(wantCnt.equals(discountCnt)) {
                        answer++;
                    }
                    discountCnt.clear();
                }
                i++;
            }
        return answer;
    }
}