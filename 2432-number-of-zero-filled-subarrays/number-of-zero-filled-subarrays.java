class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int idx=0;
        long counter=0;
        long no_of_zeros=0;
        while(idx<nums.length){
            if(nums[idx]==0){
                counter+=1;
                idx+=1;
            }
            else{
                if(counter==0){
                    idx+=1;
                }
                else{
                    int x=1;
                    while(counter!=0){
                        no_of_zeros+=x;
                        counter-=1;
                        x+=1;
                    }
                }
            }
        }
        if(counter!=0){
        int x=1;
        while(counter!=0){
            no_of_zeros+=x;
            counter-=1;
            x+=1;
        }
    }
    return no_of_zeros;
}
}