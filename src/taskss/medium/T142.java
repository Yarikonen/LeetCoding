package taskss.medium;

import utils.ListNode;

public class T142 {
    public ListNode hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow.equals(fast)){
                return slow;
            }

        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {

        ListNode curr=head;
        ListNode meet;
        meet=hasCycle(head);
        if(meet==null){
            return null;
        }

        while(curr!=meet){
            curr=curr.next;
            meet=meet.next;
        }
        return curr;

    }
}
