package lv0;

public class 특정문자를대문자로바꾸기 {
    public static void main(String[] args) {
        
    }
    public String solution(String my_string, String alp) {
        String answer = my_string.replace(alp,alp.toUpperCase());
        return answer;
    }
}
