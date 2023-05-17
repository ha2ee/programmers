package lv0;

public class 등차수열의특정한항만더하기 {
    public static void main(String[] args) {
        
    }
    
    static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(boolean temp : included) {
            int idx = 1;
            answer += temp ? a : 0;
            a += d*idx;
            idx++;
        }
        return answer;
    }
}

   