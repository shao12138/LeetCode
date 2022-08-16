package SuanFa_200;

public class ReverseList_206 {
    public static void main(String[] args) {
        ListNode a1=  new ListNode(1);
        ListNode a2=  new ListNode(2);
        ListNode a3=  new ListNode(3);
        ListNode a4=  new ListNode(4);
        ListNode a5=  new ListNode(5);
        a1.next = a2;a2.next = a3;a3.next=a4;a4.next = a5;
        reverseList(a1);
    }
    public static ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode p=head.next, succ=null, front=head;
        while (p!=null){
            succ = p.next;        //设置succ是p结点的后继结点
            p.next = front;       //使p.next指向p结点的前驱结点
            front = p;
            p = succ;             //p向后走一步
        }
        head.next = null;
        return head;
    }
}
