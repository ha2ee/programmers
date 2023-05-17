package lv0;

public class 세로읽기 {
    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
    }

    public static String solution(String my_string, int m, int c) {
        String answer = "";
        int end = m;
        for(int start = 0; start<my_string.length(); start=start+m){
            answer += my_string.substring(start,end) + ",";
            end += m;
        }
        String[] str = answer.split(",");
        answer = "";
        for(int i=0; i<str.length;i++){
            answer += str[i].charAt(c-1);
        }
        
        return answer;
    }
}
