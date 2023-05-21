package lv0;

public class L로만들기 {
    public static void main(String[] args) {
        
    }

    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        int idx = 0;
        for(char a : arr){
            if(a < 'l'){
                arr[idx]='l';
            }
            idx++;
        }
        answer = new String(arr);
        return answer;
    }
}
