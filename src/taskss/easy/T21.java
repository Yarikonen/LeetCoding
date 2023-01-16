package taskss.easy;

import utils.ListNode;

public class T21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode begining = list2;
        while(list2!=null){
            while(list1.next!=null||list1.val<=list2.val){
                list1=list1.next;
            }
            list1.next=list2;

            list2=list2.next;

        }
        return begining;

    }
}
