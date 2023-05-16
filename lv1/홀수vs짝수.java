package lv1;

public class 홀수vs짝수 {
    public static void main(String[] args) {
        
    }

    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        int evenSum = 0;
        int oddSum = 0;
        for(int i =0; i<num_list.length; i++){
            if(i%2 == 0){
                evenSum += num_list[i];
            } else {
                oddSum +=num_list[i];
            }
        }
        
        if(evenSum == oddSum){
            answer = evenSum;
        } else {
            return evenSum>oddSum ? evenSum : oddSum;
        }
        return answer;
    }
}
