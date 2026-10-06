class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = null;
        ListNode tail = null;
        ListNode current = head;
        while(current != null){
            if(current.val != val){
                ListNode newNode = new ListNode(current.val);
                if(newHead == null){
                    newHead = newNode;
                    tail = newNode;
                }else{
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            current = current.next;
        }
        return newHead;
    }
}