//== 0 ms solution
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){return null;}
       if(head.next == null){if(head.val == val){return null;}
                               else{return head;}}
        if(head.val == val){
            ListNode temp = head.next;
            head.next = null;
            head = temp;
           return removeElements(head,val);
        }
        ListNode curr = head;
        while(curr.next != null){
            ListNode forw = curr.next;
            if(forw.val == val){
                curr.next = forw.next;
                forw.next = null;
                continue;
            }
            curr = forw;
        }
        return head;
    }
}

//======== 1 ms solution

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){return null;}
        if(head.next == null){
            if(head.val == val){return null;}
            else{return head;}
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next != null){
            ListNode forw = curr.next;
            if(forw.val == val){curr.next = forw.next;}
           else{ if(curr.next != null){
          curr = curr.next;}}
        }
        return dummy.next;
    }
}
