package lv0;

public class 배열비교하기 {
    public static void main(String[] args) {
        
    }

    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sumA = 0;
        int sumB = 0;
        for(int a : arr1){
            sumA += a;
        }
        
        for(int b : arr2){
            sumB += b;
        }
        
        if(arr1.length > arr2.length){
            answer = 1;
        } else if(arr1.length < arr2.length){
            answer = -1;
        } else if(sumA>sumB){
            answer = 1;
        } else if(sumA<sumB){
            answer = -1;
        } else if(sumA == sumB){
            answer = 0;
        }
        return answer;
    }
}
