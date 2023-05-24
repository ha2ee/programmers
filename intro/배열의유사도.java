package intro;

import java.util.Arrays;

public class 배열의유사도 {
    public int solution(String[] s1, String[] s2) {
        int answer = (int)Arrays.stream(s1).filter(str -> Arrays.stream(s2).anyMatch(s-> s.equals(str))).count();
        return answer;
    }
}
