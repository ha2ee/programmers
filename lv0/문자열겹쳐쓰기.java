package lv0;

public class 문자열겹쳐쓰기 {
    public static void main(String[] args) {
        
    }

    public String arr(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s) + overwrite_string;
        
        return my_string.length() > answer.length() ? answer + my_string.substring(answer.length()) : answer;
    }
}
