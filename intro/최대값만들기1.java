package intro;

import java.util.Arrays;

public class 최대값만들기1 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}
