package lv0;

import java.util.Arrays;

public class 문자열잘라서정렬하기 {
    public static void main(String[] args) {
        
    }

    public String[] solution(String myString) {
        String[] answer = Arrays.stream(myString.split("[x]"))
        .filter(s -> !s.isEmpty())
        .sorted()
        .toArray(s -> new String[s]);
        return answer;
    }
}
