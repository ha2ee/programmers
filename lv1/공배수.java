package lv1;

public class 공배수 {
 public static void main(String[] args) {
    
 }  
 class Solution {
    public int solution(int number, int n, int m) {
        int answer = number%n ==0 && number%m == 0 ? 1 : 0;
        return answer;
    }
} 
}
