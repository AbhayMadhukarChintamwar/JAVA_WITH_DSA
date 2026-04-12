class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
       
        int first = FindOccurrence(arr, x, true);
        int last = FindOccurrence(arr, x, false);
        
        ans.add(first);
        ans.add(last);
        return ans;
        
    }
    
    int FindOccurrence(int[] arr, int x, boolean isFirst){
        
        int start = 0;
        int end = arr.length-1;
        
        int find_index = -1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] < x) start = mid +1;
            else if(arr[mid] > x) end = mid - 1;
            else{
                find_index = mid;
                if(isFirst){
                   end = mid-1; 
                }else{
                    start = mid + 1;
                }
                
            }
        }
        
        return find_index;
    }
    
    
}
