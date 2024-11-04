class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int col, row;
        col = arr1.length;
        row = arr1[0].length;

        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}