package intro;

public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.println(solution(16));
    }


    public static int solution(int n) {
        int answer = 0;
        int idx = 1;
        for(;;){
            if(Math.pow(idx,2) >= n){
                return idx;
            } else {
                n=n/idx;
            }
            idx++;
        }
}
}
