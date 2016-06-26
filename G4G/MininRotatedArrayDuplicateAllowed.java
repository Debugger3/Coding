public class Solution {
    public int searchBS(int[] arr,int begin,int end)
    {
        if(end-begin==1)
            return Math.min(arr[begin],arr[end]);
        if(begin<=end)
        {
            int mid=begin+(end-begin)/2;
            if(begin==end)
                return arr[begin];
            if(mid-1>=begin && arr[mid]<arr[mid-1])
                return arr[mid];
            else if(arr[mid]==arr[begin] && arr[mid]==arr[end])    
                return Math.min(searchBS(arr,mid+1, end),searchBS(arr,begin,mid-1));
            else if(arr[mid]>=arr[begin] && arr[end]<=arr[begin])    
                return searchBS(arr,mid+1, end);
            else if(mid+1<=end && arr[mid]<=arr[mid+1])   
                return searchBS(arr,begin,mid-1);
            else    
                return searchBS(arr,begin,mid-1);
        }
        return -1;
    }
    public int findMin(int[] nums) {
        int n=nums.length;
        return searchBS(nums,0,n-1);
        //return min;
    }
}
