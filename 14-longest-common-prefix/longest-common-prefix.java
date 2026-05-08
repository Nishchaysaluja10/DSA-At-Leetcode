class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0)return "";
        else if(strs.length==1)return strs[0];
        else if (strs[0].isEmpty()){
            return "";
        }
        else{
        int pos = 0;
        StringBuilder answer = new StringBuilder();
        char curr =strs[0].charAt(pos) ;
        boolean check = true ;
        while(check == true){  
            for(int i=0;i<strs.length;i++){
                if( strs[i].length()==pos || strs[i].charAt(pos) !=  curr  ){
                check = false;
                break ; }
            }
            if(check==true){
                answer.append(strs[0].charAt(pos));
                pos++;
                if(strs[0].length()==pos)break;
                curr=strs[0].charAt(pos);
            }
        }
        return answer.toString();
        }
    }
}