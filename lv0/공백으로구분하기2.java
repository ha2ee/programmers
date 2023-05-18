package lv0;

public class 공백으로구분하기2 {
    public static void main(String[] args) {
        
    }

    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}
