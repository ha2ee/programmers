package intro;

import java.util.Arrays;

public class 문자열정렬하기2 {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.toLowerCase().split("");
        Arrays.sort(arr);
        answer = String.join("", arr);
        return answer;
    }
}
