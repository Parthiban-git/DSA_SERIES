class Solution {
    public void deleteNode(ListNode node) {
         int deletenodeval = node.next.val;
         node.next = node.next.next;
        node.val = deletenodeval;
    }
}
// no head 