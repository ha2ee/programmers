package intro;

import java.util.Arrays;

public class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = (int)Arrays.stream(array).filter(i-> i>height).count();
        return answer;
    }
}
