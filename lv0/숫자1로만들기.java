package lv0;

public class 숫자1로만들기 {
    public static void main(String[] args) {
        
    }

    public int solution(int[] num_list) {
        int answer = 0;
        int cnt = 0;
        while(true){
            int endCnt = 0;
            for(int i = 0; i<num_list.length; i++){
                if(num_list[i] == 1){
                    endCnt ++;
                    continue;
                }
                if(num_list[i]%2 == 0){
                    num_list[i] /= 2;
                } else {
                    num_list[i] = (num_list[i]-1)/2;
                }
                cnt++;
            }
            if(endCnt == num_list.length){
                answer = cnt;
                break;
            }
            
            }
        return answer;
    }
}
