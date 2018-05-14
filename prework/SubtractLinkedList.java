
public class SubtractLinkedList {


	public static ListNode subtract(ListNode head) {
		ListNode mid = midPoint(head);
		System.out.println("Mid " + mid.val);
		ListNode halfReverse = reverse(mid.next);
		print(halfReverse);
		mid.next = halfReverse;
		
		ListNode node  = head;
		ListNode halfReverseCopy = halfReverse;
		while(halfReverse!=null){
			node.val = halfReverse.val - node.val;
			node = node.next;
			halfReverse = halfReverse.next;
		}
		mid.next = reverse(halfReverseCopy);
		print(head);
		return head;
	}
	
	public static ListNode midPoint(ListNode node){
		ListNode mid = node;
		if(node == null){
			return mid;
		}
		node = node.next;
		while(node !=null && node.next!=null){
			mid = mid.next;
			node = node.next.next;
		}
		return mid;
			
	}
	
	public static ListNode reverse(ListNode node){
		ListNode prev = null;
		ListNode curr = node;
		ListNode next;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		node = prev;
		return node;
	}
	
	public static void print(ListNode node){
		
		while(node!=null){
			System.out.print(node.val + " ->");
			node = node.next;
		}
		System.out.println("null");
	}

}

class ListNode {
 public int val;
 public ListNode next;
 ListNode(int x) {
	 val = x; next = null; 
 }
}