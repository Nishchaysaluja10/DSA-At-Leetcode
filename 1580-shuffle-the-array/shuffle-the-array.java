class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int i=0;
        int j=0;
        while(i<n*2){
            ans[i]=nums[j];
            i++;
            ans[i]=nums[j+n];
            i++;
            j++;
        }
        return ans;
    }
}