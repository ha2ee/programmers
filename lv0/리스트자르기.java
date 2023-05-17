package lv0;

public class 리스트자르기 {
    public static void main(String[] args) {
        int[] slicer = {4,5,2};
        int[] num_list = {1,2,3,4,5,6,7,8,9};
        int n = 4;
        int[] result = solution(n, slicer, num_list);
        for(int i : result){
            System.out.println(i);
        }

    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int idx =0;
        switch(n) {
            case 1 : 
                answer = new int[slicer[1]+1];
                for(int i = 0; i<=slicer[1]; i++){
                    answer[idx] = num_list[i];
                    idx++;
                }
                break;
            case 2 :
                answer = new int[num_list.length-slicer[0]];
                for(int i = slicer[0]; i<num_list.length; i++){
                    answer[idx] = num_list[i];
                    idx++;
                }
                break;
            case 3 :
                answer = new int[slicer[1]-slicer[0]+1];
                for(int i = slicer[0]; i<=slicer[1]; i++){
                    answer[idx] = num_list[i];
                    idx++;
                }
                break;
            case 4 :
                answer = new int[(slicer[1]-slicer[0])/slicer[2]+1];
                for(int i = slicer[0]; i<=slicer[1]; i=i+slicer[2]){
                    answer[idx] = num_list[i];
                    idx++;
                }
                break;
        }
        return answer; 
    }
}
