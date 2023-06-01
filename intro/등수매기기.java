package intro;

import java.util.Arrays;

public class 등수매기기 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        Arrays.fill(answer,1);
        for(int i = 0; i<score.length; i++){
            avg[i] = (score[i][0]+score[i][1])/(double)2;
        }
        
        for(int i = 0; i<avg.length; i++){
            for(int j = 0; j<avg.length; j++){
                if(avg[i]<avg[j]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
