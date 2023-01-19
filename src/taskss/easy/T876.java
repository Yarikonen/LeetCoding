package taskss.easy;

import utils.ListNode;

public class T876 {
    public ListNode middleNode(ListNode head) {
        int i =0;
        ListNode start =head;
        while(head!=null){
            head=head.next;
            i+=1;
        }
        for (int j = 0; j < (i-i%2)/2; j++) {
            start=start.next;

        }
        return start;


    }
}
