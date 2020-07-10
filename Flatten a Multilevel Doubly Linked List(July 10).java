class Solution {
    public Node flattenrec(Node head){
        Node curr = head; Node tail = head;
        while(curr != null){
            Node child = curr.child;
            Node next = curr.next;
            if(child != null){
                Node _tail = flattenrec(child);
                _tail.next = next;
                if(next != null){next.prev = _tail;}
                curr.next = child;
                child.prev = curr;
                curr.child = null;
                curr = tail;
            }
            else{
                curr = next;
                if(curr != null){tail = curr;}
            }
        }
        return tail;
    }
    public Node flatten(Node head) {
       if(head == null){return null;}
        flattenrec(head);
        return head;
    }
}
