package intro;

import java.util.Arrays;

public class 가장큰수찾기 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] temp = array.clone();
        Arrays.sort(array);
        answer[0] = array[array.length-1];
        for(int i = 0; i<array.length; i++){
            if(temp[i] == array[array.length-1]){
                answer[1] = i;
            }
        }
        return answer;
    }
}
