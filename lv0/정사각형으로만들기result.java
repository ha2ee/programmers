package lv0;

import java.util.Arrays;

public class 정사각형으로만들기result {
    public static void main(String[] args) {
        int[][] arr = {{57, 192, 534, 2},{9, 345, 192, 999}};
        // arr = new int[][]{{572, 22, 37, 0},{287, 726, 384, 0},{85, 137, 292, 0},{487, 13, 876, 0}};
        // arr = new int[][]{{572, 22, 37, 0},{287, 726, 384, 0},{85, 137, 292, 0},{487, 13, 876, 0},{487, 13, 876, 0}};
        arr = new int[][]{{1, 2}, {3, 4}, {5, 6, 7}};
        arr = new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}};
        // arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};


        int[][] result = solution(arr);

        for(int i = 0; i<result.length; i++){
            for(int j = 0; j<result[0].length; j++){
                System.out.print("["+result[i][j]+"]");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] arr) {
        int[][] answer = {};

        int row = arr.length;
        int col = arr[0].length;

        if(row > col){
            answer = new int[row][row];
            for(int i =0; i<row; i++){
                answer[i] = Arrays.copyOf(arr[i],row);
            }
        } else {
            answer = new int[col][col];
            for(int i =0; i<row; i++){
                for(int j = 0; j<col; j++){
                    answer[i][j] = arr[i][j];
                }
            }
        }


        return answer;
    }
}
