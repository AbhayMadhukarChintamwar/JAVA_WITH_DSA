class  AggressiveCows{
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        
        int low=1,high=stalls[stalls.length-1]-stalls[0] ,ans=0;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(canPlaceCows(stalls,k,mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    private boolean canPlaceCows(int[] stalls,int k,int dist){
        int cow=1, lastpos=stalls[0];
        
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastpos>=dist){
                cow++;
                lastpos=stalls[i];
            }
            if(cow>=k)  return true;
        }
        return false;
    }
}


//  https://www.geeksforgeeks.org/problems/aggressive-cows/1
