package Two_D_Array;

public class ColumWisePrint {
    public static void main(String[] args) {
        int[][] arr = {{2,3,5,1},{4,5,2,4},{3,9,7,2}};
        for (int j= 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
            
        }
    }
}

            // 2 4 3 
            // 3 5 9 
            // 5 2 7 
            // 1 4 2 