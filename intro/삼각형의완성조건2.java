package intro;

public class 삼각형의완성조건2 {
    public int solution(int[] sides) {
        int answer = 0;
        int a = sides[0] + sides[1];
        int b = Math.abs(sides[0] - sides[1]);
        return a-b-1;
    }
}
