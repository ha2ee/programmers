package intro;

public class 다항식더하기 {
    public static void main(String[] args) {
        System.out.println(solution("7"));
    }

    public static String solution(String polynomial) {
        String answer = "";
        String[] exp = polynomial.split(" ");
        int cnt = 0;
        int num = 0;
        for(int i = 0; i<exp.length; i++){
            if(exp[i].contains("x") && exp[i].length()>1){
                cnt += Integer.parseInt(exp[i].replace("x",""));
            } else if(exp[i].contains("x")&& exp[i].length()==1){
                cnt++;
            } else if(!exp[i].contains("x") && !exp[i].equals("+")){
                num += Integer.parseInt(exp[i]);
            }
        }
        if(cnt == 0){
            if(num == 0){
                return answer;
            } else if(num > 0){
                answer += num;
            }
        } else if(cnt > 1){
            if(num == 0){
                answer += cnt+"x";
            } else if(num >0){
                answer += cnt+"x + "+num;
            }
        } else if(cnt == 1){
            if(num == 0){
                answer += "x";
            } else if(num > 0){
                answer = "x + "+num;
            }
        }
        return answer;
    }
}
