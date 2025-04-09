package linked_list;

public class displaylinkedlistusingrecursion {
    public static void recursion(Node Head){
        if(Head==null) return;
        System.out.println(Head.val);
        recursion(Head.next);
        }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        recursion(a);
    }
}
