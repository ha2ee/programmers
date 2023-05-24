package intro;

public class 배열자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[(numbers.length-num1)-(numbers.length-num2)+1];
        
        for(int i = num1, j = 0; i<=num2; i++,j++){
            answer[j] = numbers[i];
        }
        
        return answer;
    }
}
