package ss3_arrays_and_methods_in_java.exercise;

public class LargestValueInArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4,5},{6,5,3,2}};
        int max = arr[0][0];
        for (int i =0; i<arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max+" là số lớn nhất! ");
    }
}
