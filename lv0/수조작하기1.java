package lv0;

public class 수조작하기1 {
    
    public static void main(String[] args) {
        
    }

    public int solution(int n, String control) {
        int i = 0;
        while(i < control.length()) {
            switch(control.charAt(i)) {
                case 'w' : n += 1;
                break;
                case 's' : n-=1;
                break;
                case 'd' : n+=10;
                break;
                case 'a' : n-=10;
                break;
            }
            i++;
        }
        return n;
    }

}
   