package intro;

public class 합성수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;
        int count1 = 0;
        
        for(int i = 1; i<=n; i++){
            int count2 = 0;
            for(int j = 1; j<=i; j++){
                if(i%j == 0){
                    count2++;
                }
                if(count2 == 3){
                    count1++;
                    break;
                }
            }
        }
        return count1;
    }
}
