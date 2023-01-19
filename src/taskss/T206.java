package taskss;


public class T206 extends AbstractTask{ //TODO MAKE RECURSIVE
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    @Override
    void perform() {
        ListNode current = new ListNode();
        ListNode next = new ListNode();

    }
    public ListNode reverseList(ListNode head) {
        reverseList(head.next).next=head;
        return head;


    }
}
