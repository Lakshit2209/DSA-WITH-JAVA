package linked_list;

    class slll{
        Node head ;
        Node tail;
        int size;
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
                System.out.println(temp.val);
                temp=temp.next;
            }
        }
//    void size(){
//        System.out.println(size);
//    }
    }
    public class insertathead {
        public static void main(String[] args) {
            slll list =new slll();
            list.insertatheadd(10);
            list.insertatheadd(20);
            list.display();
            list.insertatheadd(50);
            list.display();
//            System.out.println(list.head.val);
        }
    }

