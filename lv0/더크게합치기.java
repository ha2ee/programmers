package lv0;

public class 더크게합치기 {
    public static void main(String[] args) {
        
    }

    class Solution {
        public int solution(int a, int b) {
            int answer = a+b;
            int temp1 = Integer.parseInt(String.valueOf(a).toString()+String.valueOf(b).toString());
            int temp2 = Integer.parseInt(String.valueOf(b).toString()+String.valueOf(a).toString());
            if(answer > temp1 && answer > temp2){
                return answer;
            } else {
                return temp1 > temp2 ? temp1 : temp2;
            }

        }
    }
}
