package intro;

public class 숫자7의개수 {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            for(String b : String.valueOf(a).split("")){
                if(b.equals("7")) answer++;
            }
        }
        return answer;
    }
}
