package linked_list;
class sll{
    Node head ;
    Node tail;
    int size;
    void  insertatend(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
       else{ tail.next=temp;
        tail=temp;
       }
       size++;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
//    void size(){
//        System.out.println(size);
//    }
}
public class implementationofLL {
    public static void main(String[] args) {
        sll list =new sll();
        list.insertatend(10);
        list.insertatend(20);
        list.insertatend(30);
        list.insertatend(40);
        list.insertatend(50);
        list.display();
        System.out.println(list.size);
//        list.size();
    }
}
