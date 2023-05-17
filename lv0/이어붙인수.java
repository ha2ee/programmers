package lv0;

public class 이어붙인수 {
    public static void main(String[] args) {
        
    }

    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        for(int num : num_list){
            if(num%2 ==0) {
                even += num;
            } else {
                odd += num;
            }
        }
        answer = Integer.valueOf(even) + Integer.valueOf(odd);
        return answer;
    }
}
