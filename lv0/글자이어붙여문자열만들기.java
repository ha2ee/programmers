package lv0;

public class 글자이어붙여문자열만들기 {
    public static void main(String[] args) {
        
    }

    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] temp = my_string.split("");
        for(int i : index_list){
            answer += temp[i];
        }
        return answer;
    }
}
