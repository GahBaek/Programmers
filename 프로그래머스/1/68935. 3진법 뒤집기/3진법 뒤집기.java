class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = "";
        int toTen = 1;

        while(n>0){
            three= three + String.valueOf(n%3);
            n=n/3;
        }
        for(int i=three.length()-1;i>=0;i--){
            answer =answer+ toTen * Integer.parseInt(String.valueOf(three.charAt(i)));
            toTen = toTen * 3;
        }
        return answer;
    }
}