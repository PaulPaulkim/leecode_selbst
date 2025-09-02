public class java203 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static class Solution {
        public ListNode removeElements(ListNode head, int val){
            // dummy node
            ListNode dummy = new ListNode();
            dummy.next = head;
            //zwei Pointer
            ListNode prev = dummy;
            ListNode curr = head;
            //delete & ..
            while(curr != null){
                if(curr.val == val){
                    prev.next = curr.next;
                    curr = curr.next;
                }else{
                    prev = curr;
                    curr = curr.next;
                }
            }
            return dummy.next;
        }
    }
    static String listTostring(ListNode head){
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        ListNode cur = head;
        while(cur != null){
            sb.append(cur.val);
            if(cur.next != null){
                sb.append(" , ");
            }
            cur = cur.next;
        }
        sb.append("]");
        return sb.toString();
    }
    public static void main(String[] args) {
        ListNode n4 = new ListNode(1);
        ListNode n3 = new ListNode(2,n4);
        ListNode n2 = new ListNode(7,n3);
        ListNode n1 = new ListNode(6,n2);

        Solution sol = new Solution();
        ListNode res = sol.removeElements(n1, 7);
        System.out.println('\n');
        
       System.out.println(res ==null ? "[]" : listTostring(res));
        
    }
}
