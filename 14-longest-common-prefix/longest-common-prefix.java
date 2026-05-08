class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Arrays.sort(strs);
        // System.out.println(strs[0]);
        // List<List<String>> com = new ArrayList<>();
        // HashMap<Character,Integer> ans = new HashMap<>();
        if (strs.length==0)return "";
        else if(strs.length==1)return strs[0];
        else if (strs[0].isEmpty()){
            return "";
        }
        else{
        int pos = 0;
        String answer = "";
        char curr =strs[0].charAt(pos) ;
        boolean check = true ;
        while(check == true){  
            for(int i=0;i<strs.length;i++){
                // if(!ans.containsKey(strs[i].charAt(check))){
                //     Character ind = strs[i].charAt(check);
                //     ans.put(ind,1);
                // }
                // else{
                //     Character ind2 = strs[i].charAt(check);
                //     ans.put(ind2,ans.get(strs[i].charAt(check))++);
                // }
                // System.out.println(strs[i].charAt(0));
                // while(strs[i].charAt(check)==strs[i+1].charAt(check)){
                //     curr = curr+strs[i].charAt(check);
                //     check+=1;
                // }
                // check =0 ;
                // if(curr.length()>answer.length()){
                //     answer=curr;
                // }
                if( strs[i].length()==pos || strs[i].charAt(pos) !=  curr  ){
                check = false;
                break ; }
            }
            if(check==true){
                answer+=strs[0].charAt(pos);
                pos++;
                if(strs[0].length()==pos)break;
                curr=strs[0].charAt(pos);
            }
        }
        // System.out.println(curr);
        // if(strs.length==1)return strs[0];
        return answer;
        }
    }
}