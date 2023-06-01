package intro;

public class 최댓값만들기2 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            int a = numbers[i];
            for(int j =i+1; j<numbers.length; j++){
                max = Math.max(a*numbers[j],max);
            }
        }
        answer = max;
        return answer;
    }
}
