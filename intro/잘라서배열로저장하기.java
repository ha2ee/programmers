package intro;

public class 잘라서배열로저장하기 {
    public static void main(String[] args) {
        solution("abc1Addfggg4556b", 6);
    }


    public static String[] solution(String my_str, int n) {
        String[] answer = new String[(int)Math.ceil(my_str.length()/(double)n)];
        int startIndex = 0;
        int lastIndex = n;
        for(int i = 0; i<(int)Math.ceil(my_str.length()/(double)n); i++){
            if(lastIndex > my_str.length()) lastIndex = my_str.length();
            answer[i] = my_str.substring(startIndex, lastIndex);
            startIndex+= n;
            lastIndex += n;
        }
        return answer;
    }
}
