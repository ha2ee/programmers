package lv0;

public class 조건문자열 {
    public static void main(String[] args) {
        
    }
    class Solution {
        public int solution(String ineq, String eq, int n, int m) {
            int answer = 0;
            if(eq.equals("=")){
                if(ineq.equals(">")){
                    return n>=m ? 1 : 0;
                } else if(ineq.equals("<")){
                    return n<=m ? 1 : 0;
                }
            } else {
                if(ineq.equals(">")){
                    return n>m ? 1 : 0;
                } else if(ineq.equals("<")){
                    return n<m ? 1 : 0;
                }
            }
            return answer;
        }
    }
    
}
    
