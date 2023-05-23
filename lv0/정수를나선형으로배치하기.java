package lv0;

public class 정수를나선형으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int width = n;
        int height = n-1;

        int i = 0;
        int j = 0;

        int num = 1;

        while(num <= n*n){
        for(int k = 0; k<width; k++){ //1234
            answer[i][j] = num;
            num++;
            j++;
        }
        width--; //3
        i++; //1
        j--; //3 

        for(int k = 0; k<height; k++){ // 567
            answer[i][j] = num;
            num++;
            i++;
        }
        height--; // 2
        i--; //3
        j--; //2

        for(int k =0; k<width; k++){ //8,9,10
            answer[i][j] = num;
            num++;
            j--;
        }
        width--; //2
        i--; //2
        j++;
        //j = 0;
        
        for(int k =0; k<height; k++){ //11, 12
            answer[i][j] = num;
            num++;
            i--;
        }
        height--;
        j++;
        i++;
    }
        return answer;
    }
}
