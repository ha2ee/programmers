package lv1;

public class 원소들의곱과합 {
    
    public static void main(String[] args) {
        
    }

    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for(int num : num_list){
            sum += num;
            mul *= num;
        }
        if(mul < Math.pow(sum,2)) {
            return answer+1;
            
        } 
        return answer;
    }
}
