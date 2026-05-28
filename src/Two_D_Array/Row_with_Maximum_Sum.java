package Two_D_Array;

public class Row_with_Maximum_Sum {
    public static void main(String[] args) {
        int[][] arr = {{2,3,5,1},{4,5,2,4},{3,9,7,2}};
        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum+= arr[i][j];
            }

            if(sum>maxSum){
                maxSum = sum;
                row = i;
            }
            // maxSum = Math.max(maxSum, sum);
        }
        System.out.println(row + " "+maxSum);
    }
    
}


//  Find the minimum element out of all the maximum elements of each row
//  Print elements of 2d Array column-wise 