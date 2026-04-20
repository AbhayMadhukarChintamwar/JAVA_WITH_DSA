class ShipWithinDays {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0,max = 0;
        for(int num : weights)
        {
            sum += num;
            max = Math.max(max,num);
        }
        int low = max,high = sum;
        int res = 0;
        while(low <= high)
        {
            int mid = low+(high-low)/2;
            if(isValid(weights,days,mid))
            {
                res = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return res;
    }
    public boolean isValid(int weights[],int days,int mid)
    {
        int count = 1;
        int sum = 0;
        for(int i=0;i<weights.length;i++)
        {
            sum += weights[i];
            if(sum > mid)
            {
                sum = weights[i];
                count++;
            }
        }
        return count <= days;
    }

}

//  https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
