class Solution {
    public boolean isPowerOfThree(int n) {
        boolean str=false;
        if(n<=0){
            return str;
        }
        if(n==1){
            str=true;
            return str;
        }
        while(n>1){
            if(n%3==0){
                str= true;
                n= n/3;
            }
            else{
                str=false;
                break;
            }
        }
        return str;
    }
}