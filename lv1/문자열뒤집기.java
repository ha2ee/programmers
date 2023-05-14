package lv1;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        
    }

    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] str = my_string.split("");
        while(s<e){
            String temp = str[s];
            str[s] = str[e];
            str[e] = temp;
            s++;
            e--;
        }
        answer = String.join("",str);    
        
        return answer;
    }
}
