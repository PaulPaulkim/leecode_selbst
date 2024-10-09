package leetcode_easy;

public class ListNode_mergeTwoLists {

	public class ListNode{
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val){
			this.val = val;
			}
		ListNode(int val, ListNode Next){ 
			this.val = val; 
			this.next = next;
			}
	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1 != null && list2 != null) {
			if(list1.val< list2.val) {
				list1.next = mergeTwoLists(list1.next,list2);
				
			}
		}
		
		return list2;
		
	}
	public static void main(String[] args) {
		

	}

}
