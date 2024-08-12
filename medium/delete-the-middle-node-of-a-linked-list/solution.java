class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) 
            return null;
        
        ListNode slowNode = head, fastNode = head.next.next;
        
        while(fastNode != null && fastNode.next != null)
        {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        
        slowNode.next = slowNode.next.next;
        
        return head;

    }
}