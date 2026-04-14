class MySqrt {
    public int mySqrt(int x) {
        long low = 1;
        long high = x;
        while(low<= high){
            long mid = low + (high-low)/2;

            if(mid * mid ==x) return(int) mid;
            else if(mid * mid > x) high = mid - 1;
            else low = mid +1;

        }

        return (int) high;
    }
}



// https://leetcode.com/problems/sqrtx/
