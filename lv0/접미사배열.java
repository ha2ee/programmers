package lv0;

import java.util.Arrays;

public class 접미사배열 {
    public static void main(String[] args) {
        
    }

    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i = 0; i<my_string.length(); i++){
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
