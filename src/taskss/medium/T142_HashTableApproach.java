package taskss.medium;

import utils.ListNode;

import java.util.*;

public class T142_HashTableApproach {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> hashSet = new HashSet<>();
        int i =-1;
        while(hashSet.size()-i==1&&head!=null){
            hashSet.add(head);
            i++;
            head=head.next;

        }
        return head;


    }
}
