package lv0;

public class 조건에맞게수열변환하기3 {
    public static void main(String[] args) {
        
    }

    public int[] solution(int[] arr, int k) {
        int[] answer = arr;
        if(k%2 == 1){
            for(int i = 0; i<arr.length; i++){
                arr[i] *= k;
            }
        } else {
            for(int i = 0; i<arr.length; i++){
                arr[i] += k;
            }
        }
        return answer;
    }
}
