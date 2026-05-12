class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans=0;
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.computeIfPresent(i,(key,value)->value+1);
            }
            else{
                hm.put(i,1);
            }
        }
        for(int i:hm.values()){
            ans+=(i*(i-1))/2;
        }
        return ans;
        
    }
}