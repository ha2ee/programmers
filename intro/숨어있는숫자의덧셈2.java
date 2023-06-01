package intro;

public class 숨어있는숫자의덧셈2 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
    }


    public static int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[a-z|A-Z]","-").split("-");
        for(String a : arr){
            if(!a.equals("")){
                answer += Integer.parseInt(a);
            }
        }
        return answer;
    }
}
