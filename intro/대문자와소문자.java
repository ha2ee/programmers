package intro;

public class 대문자와소문자 {
    public String solution(String my_string) {
        String answer = "";
        
        for(char a : my_string.toCharArray()){
            answer += Character.isUpperCase(a)? Character.toLowerCase(a) : Character.toUpperCase(a);
        }
        return answer;
    }
}
