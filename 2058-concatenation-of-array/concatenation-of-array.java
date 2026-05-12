class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length*2;
        int[] ans = new int[l];
        System.arraycopy(nums,0,ans,0,l/2);
        System.arraycopy(nums,0,ans,l/2,l/2);
        return ans;
    }
}