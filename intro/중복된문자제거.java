package intro;

public class 중복된문자제거 {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        for(char c : my_string.toCharArray()){
            if(sb.indexOf(String.valueOf(c)) == -1){
                sb.append(c);
            }
        }
        answer = sb.toString();
        return answer;
    }
}
