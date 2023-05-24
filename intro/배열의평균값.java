package intro;

import java.util.Arrays;

public class 배열의평균값 {
    public static void main(String[] args) {
        
    }

    public double solution(int[] numbers) {
        double answer = Arrays.stream(numbers).average().orElse(0);
        return answer;
    }
}
