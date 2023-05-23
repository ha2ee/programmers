package intro;

import java.util.Arrays;

public class 배열두배만들기 {
    public static void main(String[] args) {
        
    }

    public int[] solution(int[] numbers) {
        int[] answer =  Arrays.stream(numbers).map(i -> i*2).toArray();
        return answer;
    }
}
