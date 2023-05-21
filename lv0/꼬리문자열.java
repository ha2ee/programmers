package lv0;

public class 꼬리문자열 {
    public static void main(String[] args) {
        
    }
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(String str : str_list){
            if(!str.contains(ex)){
                answer+= str;                
            }
        }
        return answer;
    }
}
