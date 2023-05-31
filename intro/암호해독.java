package intro;

public class 암호해독 {
    public static void main(String[] args) {
        
    }

    public String solution(String cipher, int code) {
        String answer = "";
        StringBuffer sb = new StringBuffer();

        for(int i = code-1; i<cipher.length(); i+=code){
            sb.append(cipher.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }
}
