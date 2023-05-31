package intro;

import java.util.Arrays;

public class 가까운수 {
    public static void main(String[] args) {
        int[] array = {90};
        int n = 95;
        System.out.println(solution(array, n));
    }

    public static int solution(int[] array, int n) {
        if(array.length == 1){
            return n;
        }
        int answer = 0;
        Arrays.sort(array);
        int temp = 101;
        int temp2 = 101;
        for(int i = 1; i<array.length; i++){
            int a = Math.abs(array[i-1]-n); //0번인덱스부터 값을 빼서 절대값을 구함 1-26 -> 25
            int b = Math.abs(array[i]-n); // 1번인덱스부터 값을 빼서 절대값을 구함 51 -26 -> 25
            if(temp2 < Math.min(a,b)){ // temp2가 둘중 최소값보다 값이 작으면 다음반복
                continue;
            } else if(temp2 == Math.min(a,b)){ //temp2가 최소값과 같다면 다음반복
                continue;
            } else{
                temp = a<=b?array[i-1] : array[i]; // 둘다 아닐때 a가 b보다 작다면(0번인덱스의 값 차이가 1번인덱스의 차이보다 작다면) temp에 0번인덱스값 저장, 아니라면 1번인덱스 값 저장
            }
            temp2 = Math.min(a,b);
        }
        answer = temp;

        return answer;
    }
}
