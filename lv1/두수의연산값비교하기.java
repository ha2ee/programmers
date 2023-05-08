package lv1;

public class 두수의연산값비교하기 {
    public static void main(String[] args) {

        
    }
    class Solution {
        public int solution(int a, int b) {
            int answer = 2*a*b;
            int temp = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
           return answer > temp ? answer : temp;
        }
    }
}
