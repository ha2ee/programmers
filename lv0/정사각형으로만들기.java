package lv0;

import java.util.ArrayList;
import java.util.Collections;

public class 정사각형으로만들기 {
    public static void main(String[] args) {
        int[][] arr = {{57, 192, 534, 2},{9, 345, 192, 999}};
        // arr = new int[][]{{572, 22, 37, 0},{287, 726, 384, 0},{85, 137, 292, 0},{487, 13, 876, 0}};
        // arr = new int[][]{{572, 22, 37, 0},{287, 726, 384, 0},{85, 137, 292, 0},{487, 13, 876, 0},{487, 13, 876, 0}};
        // arr = new int[][]{{1, 2}, {3, 4}, {5, 6, 7}};
        // arr = new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}};
        arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};


        int[][] result = solution(arr);

        for(int i = 0; i<result.length; i++){
            for(int j = 0; j<result[0].length; j++){
                System.out.print("["+result[i][j]+"]");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] arr) {
        int[][] answer = arr;
        
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        for(int[] row : arr){
            ArrayList<Integer> inner = new ArrayList<>();
            for(int num : row){
                inner.add(num);
            }
            matrix.add(inner);
        }
        
        
        if(matrix.size() > matrix.get(0).size()){
            for(int i = 0; i<matrix.size(); i++){
                matrix.get(i).add(0);
            }
        } else if(matrix.size() < matrix.get(0).size()) {
            for(int i = 0 ,size = matrix.size(); i<matrix.get(0).size()-size; i++){
                matrix.add(new ArrayList<Integer>(Collections.nCopies(matrix.get(0).size(),0)));
            }
        } else {
            return arr;
        }
        
        answer = matrix.stream()
            .map(row -> row.stream().mapToInt(Integer::intValue).toArray())
            .toArray(int[][]::new);
            
        
        return answer;
    }
}
