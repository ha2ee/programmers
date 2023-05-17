package lv0;

public class 숫자5명씩 {
    public static void main(String[] args) {
        
    }
    public String[] solution(String[] names) {
        String[] answer = new String[(int)Math.ceil((double)names.length/5)];
        for(int i = 0, j = 0; j<names.length; i++, j+=5){
            answer[i] = names[j];
        }
        return answer;
    }
}
