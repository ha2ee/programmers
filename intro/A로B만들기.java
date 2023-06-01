package intro;

public class A로B만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        int a = before.chars().sum();
        int b = after.chars().sum();
        if(a == b){
            answer = 1;
        }
        return answer;
    }
}
