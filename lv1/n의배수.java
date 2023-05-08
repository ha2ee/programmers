package lv1;

public class n의배수 {
    public static void main(String[] args) {
        
    }
    class Solution {
        public int solution(int num, int n) {
            int answer = num%n;
            
            return answer == 0 ? 1 : 0;
        }
    }
}
