package SuanFa_RuMen;

public class ReverseList_206 {
    public ListNode reverseList(ListNode head) {
        ListNode p=head.next, succ=null, front=null;
        while (p!=null){
            succ = p.next;        //设置succ是p结点的后继结点
            p.next = front;       //使p.next指向p结点的前驱结点
            front = p;
            p = succ;             //p向后走一步
        }
        head.next = front;
        return head;
    }
}
