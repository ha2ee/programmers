package intro;

public class 숨어있는숫자의덧셈1 {
    public int solution(String my_string) {
        int answer = my_string.replaceAll("[a-z,A-Z]","").chars().map(i->Character.getNumericValue(i)).sum();
        return answer;
    }
}
