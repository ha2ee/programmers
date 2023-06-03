package intro;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        String[] arr = new String[quiz.length];
        int idx = 0;
        for(String a : quiz){
            arr[idx] = a;
            idx++;
        }
        
        for(int i = 0; i<arr.length; i++){
            String[] cal = arr[i].split(" ");
            if(cal[1].equals("-")){
                answer[i] = Integer.parseInt(cal[0])-Integer.parseInt(cal[2]) == Integer.parseInt(cal[4]) ? "O" : "X";
            } else if(cal[1].equals("+")){
                answer[i] = Integer.parseInt(cal[0])+Integer.parseInt(cal[2]) == Integer.parseInt(cal[4]) ? "O" : "X";
            }
        }
        return answer;
    }
}
