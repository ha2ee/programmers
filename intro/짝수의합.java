package intro;

import java.util.stream.IntStream;

public class 짝수의합 {
    public int solution(int n) {
        int answer = IntStream.rangeClosed(1,n)
            .filter(i-> i%2 == 0)
            .sum();
        return answer;
    }
}
