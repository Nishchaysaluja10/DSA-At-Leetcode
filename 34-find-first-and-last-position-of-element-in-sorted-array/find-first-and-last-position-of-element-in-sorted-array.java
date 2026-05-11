class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1 ;
        if(nums.length==0){
            int[] ans = {-1,-1};
        }
        if(nums.length==1){
            if(nums[0]==target){
                int[] ans = {0,0};
                return ans;
            }
        }
        while(left<=right){
            int mid =(left+right)/2;
            if(nums[mid]==target){
                // if(mid!=0 && nums[mid-1]==target){
                //     int[] ans={mid-1,mid};
                //     return ans ;
                // }
                // else if(mid!=nums.length-1 && nums[mid+1]==target){
                //     int[] ans={mid,mid+1};
                //     return ans ;
                // }
                // else{
                //     int[] ans={mid,mid};
                //     return ans ;
                // }
                int rightL=mid;
                int leftL = mid;
                while(rightL<nums.length && nums[rightL]==nums[mid])rightL+=1;
                while(leftL>=0 && nums[leftL]==nums[mid])leftL-=1;
                int ans[] = {leftL+1,rightL-1};
                return ans ; 
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        int[] ans = {-1,-1};
        return ans ;
    }
}