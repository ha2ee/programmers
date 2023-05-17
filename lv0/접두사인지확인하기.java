package lv0;

public class 접두사인지확인하기 {
    public static void main(String[] args) {
        
    }

    public int solution(String my_string, String is_prefix) {
        int answer = my_string.startsWith(is_prefix) ? 1 : 0;
        
        return answer;
    }
}
