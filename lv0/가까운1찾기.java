package lv0;
public class 가까운1찾기 {
    public static void main(String[] args) {
        
    }

    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i = idx; i<arr.length; i++){
            if(arr[i] == 1){
                return answer = i;
            } 
        }
        answer = -1;
        return answer;
    }
}
