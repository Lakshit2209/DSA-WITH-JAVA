package linked_list;

class sllll{
    Node head ;
    Node tail;
    int size;
    void  insert(int idx,int val){
        if(idx>size) {
            System.out.println("invalid");
        }
        Node temp=new Node(val);
      Node x=head;
      for(int i=1;i<idx-1;i++){
          x=x.next;
        }
      temp.next=x.next;
      x.next=temp;
    }
    void  insertatheadd(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val);
            temp=temp.next;
        }
        System.out.println();
    }
//    void size(){
//        System.out.println(size);
//    }
}
public class insertatspecificlocation {
    public static void main(String[] args) {
        sllll list = new sllll();
        list.insertatheadd(1);
        list.insertatheadd(2);
        list.insertatheadd(3);
        list.display();
        list.insert(2,50);
        list.display();
//            System.out.println(list.head.val);
    }
}
