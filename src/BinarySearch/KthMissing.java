class KthMissing {
    public int kthMissing(int[] arr, int k) {
        // code here
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int  mid = (low + high)/2;
            int correctNo = mid + 1;
            int missing = arr[mid] - correctNo;
            
            if(missing >= k) high = mid - 1;
            else low = mid + 1;
        }
        return high + 1 + k;
    }
}
