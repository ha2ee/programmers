package intro;

public class 문자열뒤집기 {
    public String solution(String my_string) {
        String answer = new StringBuilder(my_string).reverse().toString();
        return answer;
    }
}
