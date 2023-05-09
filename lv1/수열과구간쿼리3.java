package lv1;

public class 수열과구간쿼리3 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,3},{1,2},{1,4}};
        int[] result = solution(arr,queries);
        for(int i : result) {
            System.out.println(i);
        }
        
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries) {
            int i = query[0];
            int j = query[1];
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
