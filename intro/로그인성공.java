package intro;

public class 로그인성공 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(String[] idpw : db){
            if(idpw[0].equals(id_pw[0])){
                if(idpw[1].equals(id_pw[1])){
                    return answer = "login";
                } else {
                    return answer = "wrong pw";
                }
            } else {
                answer = "fail";
            }
        }
        return answer;
    }
}
