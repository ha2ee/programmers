package lv0;

public class 길이에따른연산 {
    public static void main(String[] args) {
        
    }

    public int solution(int[] num_list) {
        int answer = 1;
        if(num_list.length >=11){
            for(int i : num_list){
                answer += i;
                }
            answer--;
        } else {
            for(int i : num_list){
                answer*=i;
            }
        }
        return answer;
    }
}
