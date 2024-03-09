class Solution {
    public String solution(String s) {
         
        String[] arr = s.split(" ");

        int max = Integer.parseInt(arr[0]), min = Integer.parseInt(arr[0]);
        for(int i = 0 ; i < arr.length; i++){
            int num = Integer.parseInt(arr[i]);

            if(num > max){
                max = num;
            }else if(num < min){
                min = num;
            }
        }
        String answer = ""+min +" "+ max;
        return answer;
    }
}