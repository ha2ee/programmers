package lv0;

import java.util.stream.Stream;

public class 세개의구분자 {
    public static void main(String[] args) {
        
    }

    public String[] solution(String myStr) {
        String[] answer = Stream.of(myStr.split("[abc]+"))
        .filter(s -> !s.isEmpty())
        .toArray(String[]::new);
        if(answer.length == 0) {
            return new String[]{"EMPTY"};
        }
        return answer;
    }
}
