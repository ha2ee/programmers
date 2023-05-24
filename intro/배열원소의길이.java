package intro;

import java.util.stream.Stream;

public class 배열원소의길이 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        answer = Stream.of(strlist).mapToInt(i->i.length()).toArray();
        return answer;
    }
}
