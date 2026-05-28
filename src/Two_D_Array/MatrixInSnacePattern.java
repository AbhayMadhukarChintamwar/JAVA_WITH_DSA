package Two_D_Array;

public class MatrixInSnacePattern {
    public static void main(String[] args) {
        int[][] arr = { { 2, 3, 5, 1 }, { 4, 5, 2, 4 }, { 3, 9, 7, 2 }, { 2, 3, 1, 5 } };
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

            // 4 2 5 4
            // 3 9 7 2
            // 5 1 3 2