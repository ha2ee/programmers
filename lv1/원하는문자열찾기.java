package lv1;

public class 원하는문자열찾기 {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG", "aBc"));
    }
    public static int solution(String myString, String pat) {
        int answer = 0;
        if(myString.toLowerCase().contains(pat.toLowerCase())){
            answer =1;
        }
        return answer;
    }
}
