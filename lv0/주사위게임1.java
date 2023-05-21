package lv0;

public class 주사위게임1 {
    public static void main(String[] args) {
        
    }

    public int solution(int a, int b) {
        int answer = 0;
        
        if(a % 2 == 1 && b % 2 == 1){
            answer = a*a + b*b;
        }else if(a%2 ==1 || b%2==1){
            answer = 2*(a+b);
        } else {
            answer = Math.abs(a-b);
        }
        
        return answer;
    }
}
