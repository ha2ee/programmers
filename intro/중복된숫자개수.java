package intro;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class 중복된숫자개수 {
    public int solution(int[] array, int n) {
        int answer = Collections.frequency(Arrays.stream(array).boxed().collect(Collectors.toList()),n);
        return answer;
    }
}
