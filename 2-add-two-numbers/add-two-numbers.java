/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode curr1 = l1 ;
            ListNode curr2 = l2 ;
            ListNode l3 = new ListNode();
            ArrayList<Integer> arr  = new ArrayList<>();
            while(curr1 != null && curr2 != null){
                int v = curr1.val + curr2.val ;
                arr.add(v);
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            while(curr2 != null){
                arr.add(curr2.val);
                curr2 = curr2.next;
            }
        
            while(curr1 != null){
                arr.add(curr1.val) ; 
                curr1 = curr1.next;
            }
            ListNode crr4 = l3;
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)/10==1){
                    if(i<arr.size()-1){
                    arr.set(i,arr.get(i)%10);
                    arr.set(i+1,arr.get(i+1)+1);}
                }
                if(arr.get(arr.size()-1)>=10){
                    arr.set(arr.size()-1,arr.get(arr.size()-1)%10);
                    arr.add(1);
                }
                crr4.next = new ListNode(arr.get(i));
                crr4 = crr4.next;
            }
        return l3.next;

    }
}