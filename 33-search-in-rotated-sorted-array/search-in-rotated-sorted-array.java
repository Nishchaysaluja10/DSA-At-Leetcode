class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1 && nums[0]==target){
            return 0;
        }
        if(nums.length==2){
            if(nums[0]==target)return 0;
            else if(nums[1]==target) return 1;
            else return -1;
        }
        int left =0;
        int right = nums.length-1;
        if(nums[left]<nums[right]){
            if(target<nums[left] || target>nums[right])return -1;
            else{
                while(left<=right){
                    int mid = (left+right)/2;
                    if(target==nums[mid]){
                        return mid;
                    }
                    else if(target>nums[mid]){
                        left = mid+1;
                    }
                    else{
                        right = mid-1;
                    }
                }
                return -1;
            }
        }
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target)return mid;
            else if(target==nums[right])return right;
            else if(target==nums[left])return left;
            else if(target>nums[mid]&&target<nums[right]){
                if(nums[right]>nums[mid]) left=mid+1;
                else right=mid-1;
            }
            else if(target>nums[mid] &&target>nums[right]){
                if(nums[right]>nums[mid]) right=mid-1;  
                else left=mid+1;
            }
            else if(target<nums[mid] && target>nums[left]){
                if(nums[mid]>nums[left]) right=mid-1;
                else left=mid+1;
            }
            else{
                if(nums[mid]>nums[left]) left=mid+1;
                else right=mid-1;
            }
        }
        return -1 ;
        
    }
}