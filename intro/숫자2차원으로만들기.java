package intro;

public class 숫자2차원으로만들기 {
    public static void main(String[] args) {
        
    }

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx = 0;
        for(int i = 0; i<answer.length; i++){
            for(int j = 0; j<answer[0].length; j++){
                answer[i][j] = num_list[idx];
                idx++;
            }
        }
        return answer;
    }
}
