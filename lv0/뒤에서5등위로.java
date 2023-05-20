package lv0;

import java.util.Arrays;

public class 뒤에서5등위로 {
    public static void main(String[] args) {
        
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        for(int i =5,j=0; i<num_list.length; i++,j++){
            answer[j] = num_list[i];
        }
        return answer;
    }
}
