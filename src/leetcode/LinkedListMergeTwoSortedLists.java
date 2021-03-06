package leetcode;

//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3->4->4
public class LinkedListMergeTwoSortedLists{
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if (node1==null||node2==null){
            return node1==null?node2:node1;
        }
        ListNode orig = new ListNode(0);
        ListNode prev = orig;
        while (node1!=null&&node2!=null){
            if (node1.val<=node2.val){
                prev.next = node1;
                prev = node1;
                node1 = node1.next;
            }
            else {
                prev.next = node2;
                prev = node2;   
                node2 = node2.next;
            }
        }
        prev.next = node1==null?node2:node1;
        return orig.next;
    }
    //my method
    public ListNode MergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = MergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = MergeTwoLists(l1, l2.next);
			return l2;
		}
    }
    //recursive method
}