package intro;

public class 숫자비교하기 {
    public static void main(String[] args) {
        
    }   

    public int solution(int num1, int num2) {
        int answer = num1==num2 ? 1 : -1;
        return answer;
    }

    public int euclidean(int a, int b) {
        if(b == 0){
            return a;
        }
        return euclidean(b, a%b);
    }

}
