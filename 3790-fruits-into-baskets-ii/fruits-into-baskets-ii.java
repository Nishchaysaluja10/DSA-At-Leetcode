import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {


        int i = 0, j = 0;
        //int count=0;
        ArrayList<Integer> mark = new ArrayList<>();
        while (i < fruits.length && j < baskets.length) {
            if (fruits[i] <= baskets[j] &&  !mark.contains(j)) {
                mark.add(j);
                i++;
                j=0;
                //count=0;
            } else {
                //count+=1;
                j++;
                if(j==baskets.length){
                    //count=0;
                    j=0;
                    i++;
                }
            }
        }
        
        return fruits.length-mark.size();
    }
}
