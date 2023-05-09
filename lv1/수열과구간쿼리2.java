package lv1;

public class 수열과구간쿼리2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};
        int[] result = solution(arr, queries);
        for(int i : result) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
           for(int i = 0; i<queries.length; i++) {
               int s = queries[i][0];
               int e = queries[i][1];
               int k = queries[i][2];

               int min = Integer.MAX_VALUE;
               boolean found = false;

               for(int j = s;j<=e; j++) {
                if(arr[j]>k && arr[j] < min){
                    min = arr[j];
                    found = true;
                  } 
               }
               answer[i] = found ? min : -1;
           }
           return answer;
   }
}
