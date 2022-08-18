class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<Node, Node>();
        Node node=head;
        while(node!=null){
            map.put(node,new Node(node.val));
            node=node.next;
        }
        node=head;
        while(node!=null){
            map.get(node).next=map.get(node.next);
            map.get(node).random=map.get(node.random);
            node=node.next;
        }
        return map.get(head);
    }
}
////
///////////


class Solution {
    public Node copyRandomList(Node head) {
        Node current = head, next;

          //  make copy of each node,
          // and link them together side-by-side in a single list.
          while (current != null) {
            next = current.next;

            Node copy=new Node(current.val);
            current.next = copy;
            copy.next = next;

            current = next;
          }

          
          current = head;
          while (current != null) {
            if (current.random != null) {
              current.next.random = current.random.next;
            }
            current = current.next.next;
          }

          // Third round: restore the original list, and extract the copy list.
          current = head;
          Node dummy = new Node(0);
          Node copy, copyTail = dummy;

          while (current != null) {
            next = current.next.next;

            // extract the copy
            copy = current.next;
            copyTail.next = copy;
            copyTail = copy;

            // restore the original list
            current.next = next;

            current = next;
          }

          return dummy.next;
    }
}