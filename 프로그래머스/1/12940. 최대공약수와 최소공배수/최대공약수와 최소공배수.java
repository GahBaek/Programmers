import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        ArrayList<Integer> nList = new ArrayList<>();
        ArrayList<Integer> mList = new ArrayList<>();
        for(int i = 1; i <= m; i++) {
            if(m % (i)== 0){
                mList.add(i);
            }
        }
        for(int i = 1; i <= n; i++) {
            if(n % (i)== 0){
                nList.add(i);
            }
        }
        if(nList.size()>mList.size()){
            for(int i = 0; i < mList.size(); i++){
                if(nList.contains(mList.get(i))){
                    answer[0] = mList.get(i);
                }
            }
        }else{
            for(int i = 0; i < nList.size(); i++){
                if(mList.contains(nList.get(i))){
                    answer[0] = nList.get(i);
                }
            }
        }
        if(answer[0] != 1){
            m /= answer[0];
            n /= answer[0];
            answer[1] = m*n*answer[0];
        }else{
            answer[1] = m*n;
        }
        return answer;
    }
}