package lv0;

public class 특별한이차원배열1 {
    public static void main(String[] args) {
        
    }   
    
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i<answer.length; i++){
            for(int j = i; j<answer[0].length; j++){
                answer[i][j] = 1;
                break;
            }
        }
        return answer;
    }
}
