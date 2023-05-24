package intro;

public class 아이스아메리카노 {
    public int[] solution(int money) {
        int americano = 5500;
        int[] answer = new int[]{money/americano,money%americano};
        return answer;
    }
}
