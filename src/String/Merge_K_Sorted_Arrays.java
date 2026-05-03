import java.util.*;

class Solution {
    
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        int k = mat.length;
        return mergeSort(mat, 0, k - 1);
    }
    

    private ArrayList<Integer> mergeSort(int[][] mat, int left, int right) {
        
        if (left == right) {
            ArrayList<Integer> res = new ArrayList<>();
            for (int num : mat[left]) {
                res.add(num);
            }
            return res;
        }
        
        int mid = left + (right - left) / 2;
        
        ArrayList<Integer> leftPart = mergeSort(mat, left, mid);
        ArrayList<Integer> rightPart = mergeSort(mat, mid + 1, right);
        
        return merge(leftPart, rightPart);
    }
    

    private ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0;
        
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                result.add(a.get(i++));
            } else {
                result.add(b.get(j++));
            }
        }
        
 
        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));
        
        return result;
    }
}

//  https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/1
