package intro;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        String answer = Arrays.stream(my_string.split("")).map(i-> i.repeat(n)).collect(Collectors.joining());
        return answer;
    }
}
