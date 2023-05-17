package lv0;

public class 콜라츠수열만들기 {
    public static void main(String[] args) {
        int[] arr = solution(10);

        for(int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] solution(int n) {
        int[] answer = {};
        int[] tempArr = new int[n];
        int idx = 0;
        while(true){
            tempArr[idx] = n;
            idx ++;
            
            if(n % 2 == 0){
                n = n/2;
                tempArr[idx] = n;
            }  else if(n == 1) {
                tempArr[idx] = n;
                break;   
            } else if(n % 2 == 1) {
                n = 3*n+1;
                tempArr[idx] = n;
            }
        }
        answer = new int[idx];
        for(int i = 0; i<idx; i++){
            answer[i] = tempArr[i];
        }
        
        return answer;
    }
}
