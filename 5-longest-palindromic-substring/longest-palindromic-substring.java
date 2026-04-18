class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int start = 1;
        if(s.length()<=1){return s;}
        String res = "";
        int ded = 1;
        boolean check = true;
        int i = 1;
        while(check && i<s.length()){
            if(s.charAt(i)!=s.charAt(0)){
                check=false;
                break;
            }
            else{
                i+=1;
            }
        }
        if(check == true){
            return s;
        }
        while(start<len-1){
            if(s.charAt(start-ded)==s.charAt(start+ded)){
                String a = new String(s.substring(start-ded,start+ded+1));
                if(a.length()>res.length()){
                    res=a;
                }
                ded+=1;
                if(ded>start || start+ded>len-1){
                    start+=1;
                    ded=1;
                }
            }
            else{
                start+=1;
                ded=1;
            }
        }
        start=0;
        ded=0;
        while(start+ded<len-1){
                if(s.charAt(start-ded)==s.charAt(start+ded+1)){
                    String b = new String(s.substring(start-ded,start+ded+2));
                    if(b.length()>res.length()){
                        res=b;
                    }
                if(start<ded || start+ded>len-1){
                    start+=1;
                    ded=1;
                }
                else {
                    ded+=1;
                    if(ded>start){
                        start+=1;
                        ded = 0;
                    }
                }
                }
                    
                else{
                    start+=1;
                    ded=0;
                }
        }
        if(res.length()==0){
            res= s.substring(0,1);
        }
        return res;
    }
}