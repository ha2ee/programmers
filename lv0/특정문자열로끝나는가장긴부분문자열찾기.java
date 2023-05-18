package lv0;

public class 특정문자열로끝나는가장긴부분문자열찾기 {
    public static void main(String[] args) {
        
    }   
    
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = myString.lastIndexOf(pat)+pat.length();
        answer = myString.substring(0,idx);
        return answer;
    }
}
