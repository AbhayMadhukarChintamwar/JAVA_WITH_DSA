class ArrangeCoins {
    public int arrangeCoins(int n) {
        long low = 0, high = n, ans = 0;
        while(low<= high){
            long k = low + (high-low)/2;
            long m = k *(k+1)/2;
            if(m==n) return (int) k;
            else if(m>n){
                high = k-1;
            }else{
                ans = k;
                low = k+1;
            }
        }

        return (int)ans;
    }
}


//  https://leetcode.com/problems/arranging-coins/
