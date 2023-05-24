package intro;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = String.valueOf(n).chars().map(s -> Character.getNumericValue(s)).sum();
        return answer;
    }
}
