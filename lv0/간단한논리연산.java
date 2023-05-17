package lv0;

public class 간단한논리연산 {
    public static void main(String[] args) {
        
    }

    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        
        if((x1 || x2) && (x3 || x4)) {
            answer = true;
        } 
        
        return answer;
    }
}
