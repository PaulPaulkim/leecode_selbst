public class java206 {
     public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { 
        this.val = val; this.next = next;
        }
    }
    public static class Solution{
        public ListNode reverseList(ListNode head){
            ListNode prev = null;
            ListNode curr = head;

            while (curr!= null) {
                ListNode Temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = Temp;

            }
            return prev;
        }
    }
  
    public static void main(String[] args) {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);

        System.out.println('\n');
        Solution sol = new Solution();
        sol.reverseList(n1);
        
         
    }
}

