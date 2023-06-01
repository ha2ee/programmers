package intro;

public class 외계어사전 {
    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell, dic));
    }
    public static int solution(String[] spell, String[] dic) {
        int answer = 2;
        int a = String.join("",spell).chars().sum();
        for(String c : dic){
            int b = c.chars().sum();
            if(a == b){
                return answer = 1;
            }
        }
        return answer;
    }
}
