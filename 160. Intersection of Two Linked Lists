public class java160 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

  public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
    while(headA == null || headB ==null){
      return null;
    }
    ListNode a = headA;
    ListNode b = headB;

    while(a!=b){
      if(a == null){
        a = headB;
      }else{
        a = a.next;
      }

      if(b == null){
        b= headA;
      }else{
        b = b.next;
      }
    }

    return a;
    
  } 
 
  public static void main(String[] args) {
    ListNode nodeA1 = new ListNode(4);
    ListNode nodeA2 = new ListNode(1);
    ListNode nodeA3 = new ListNode(8);
    ListNode nodeA4 = new ListNode(4);
    ListNode nodeA5 = new ListNode(5);

    nodeA1.next = nodeA2;
    nodeA2.next = nodeA3;
    nodeA3.next = nodeA4;
    nodeA4.next = nodeA5;

    //ListNode B
    ListNode nodeB1 = new ListNode(5);
    ListNode nodeB2 = new ListNode(6);
    ListNode nodeB3 = new ListNode(1);
    
    nodeB1.next = nodeB2;
    nodeB2.next = nodeB3;
    nodeB3.next = nodeA3;

    ListNode result = getIntersectionNode(nodeA1, nodeB1);
    if(result != null){
      System.out.println("intersect" + result.val);
    }else{
      System.out.println("keine intersect");
    }
  }

}
