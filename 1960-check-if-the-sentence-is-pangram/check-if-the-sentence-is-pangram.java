class Solution {
    public boolean checkIfPangram(String sentence) {
        ArrayList<Character> ch= new ArrayList<>();
        int counter=0;
        int length = sentence.length();
        if(length<26){
            return false;
        }
        for(int i=0;i<length;i++){
            if(!ch.contains(sentence.charAt(i))){
                counter+=1;
                ch.add(sentence.charAt(i));}
            if(length-i<26-counter)return false;
            if(counter==26) return true;
        }
        return false;
    }
}