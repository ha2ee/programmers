package lv0;

public class 배열의길이를2의거듭제곱으로만들기 {
    public static void main(String[] args) {
        
    }

    public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        while(true){
            if(arr.length > Math.pow(2,i)){
                i++;
            } else {
                break;
            }
        }
        answer = new int[(int)Math.pow(2,i)];
        
        for(int j = 0; j<arr.length; j++){
            answer[j] = arr[j];
        }
        return answer;
    }
}
