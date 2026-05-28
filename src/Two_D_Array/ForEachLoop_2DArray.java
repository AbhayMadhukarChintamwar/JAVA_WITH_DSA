package Two_D_Array;

public class ForEachLoop_2DArray {
    public static void main(String[] args) {
        int[][] arr = {{2,3,5,1},{4,5,2,4},{3,9,7,2}};
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

            // 2 3 5 1 
            // 4 5 2 4 
            // 3 9 7 2 