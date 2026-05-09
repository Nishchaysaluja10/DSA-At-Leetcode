class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right = nums.length-1;
            while(left<right){
                int curr = nums[i]+nums[left]+nums[right];
                if(Math.abs(target-curr)<Math.abs(target-ans))ans=curr;
                if(target-curr>0){
                    while(left<right && nums[left+1]==nums[left])left++;
                    left++;}
                else if(target-curr<0){
                   while(left<right && nums[right-1]==nums[right])right--;
                   right--;} 
                else{
                    return curr;
                }
            }
        }
        return ans;        
    }
}