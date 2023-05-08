package lv1;

public class 홀짝에따라다른값반환하기 {
    public static void main(String[] args) {
        
    }
    class Solution {
        public int solution(int n) {
            int answer = 0;
            if(n%2 == 1) {
                for(int i = 1; i<=n; i++){
                    if(i%2 ==1){
                    answer+=i;    
                    } else {
                        continue;
                    }
                }
            } else {
                for(int i = 2; i<=n; i=i+2) {
                    if(i%2 == 0) {
                    answer += Math.pow(i,2);
                    }else {
                        continue;
                    } 
                } 
            }
            return answer;
        }
    }
}
