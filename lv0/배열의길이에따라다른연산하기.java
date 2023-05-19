package lv0;

public class 배열의길이에따라다른연산하기 {
    public static void main(String[] args) {
        
    }

    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        
        for(int i = 0; i<arr.length; i+=2){
            if(arr.length%2 != 0){
                arr[i] += n;
            } else {
                arr[i+1] += n;
            }
        }
        return answer= arr;
    }
}
