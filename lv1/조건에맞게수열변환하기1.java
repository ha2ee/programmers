package lv1;

public class 조건에맞게수열변환하기1 {
    public static void main(String[] args) {
        
    }
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int idx = 0;
        for(int i : arr){
            if(i>=50 && i%2 ==0){
                i /= 2;
                answer[idx] = i;
            } else if(i<50 && i%2 == 1){
                i*=2;
                answer[idx] = i;
            }else {
                answer[idx] = i;
            }
            idx++;
        }
        return answer;
    }
}
