package doublylinkedlist;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val=val;
    }
}
class dll{

    Node head;
    Node tail;
    int size;
    void display(){
        Node temp=head;
      while(temp!=null){
          System.out.print(temp.val+" ");
        temp=temp.next;
    }
    System.out.println();
    }
    void insertattail(int val){
        Node temp=new Node(val);
        if(size==0) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void insertathead(int val){
        Node temp=new Node(val);
        if(size==0) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    void insert(int idx,int val){
        if(idx==0){
            insertathead(val);
            return;
        }
        if(idx==size){
            insertattail(val);
            return;
        }
        if(idx>size||idx<0){
            System.out.print("invalid index");
        }
        Node temp=new Node(val);
        Node x=head;
        for(int i=1;i<idx-1;i++){
            x=x.next;
        }
        Node y=x.next;
        x.next=temp; x.prev=temp;
        y.prev=temp; temp.next=y;
        size++;}
         void deleteathead() throws Error{
if(head==null) throw new Error("List is empty");
head=head.next;
head.prev=null;
size--;
        }
    void deleteattail() throws Error{
        if(head==null) throw new Error("List is empty");
tail=tail.prev;
tail.next=head;
        size--;
    }
    void delete(int idx){
        if(idx==0){
            deleteathead();
            return;
        }
        if(idx==size-1){
            deleteattail();
            return;
        }
        if(idx>=size||idx<0){
            System.out.print("invalid index");
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp=temp.next;
        temp.prev=temp.prev.prev;
        size--;
    }
    }

public class implementation {
    public static void print(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
    }
        System.out.println();
    }
    public static void display(Node node){
        Node temp=node;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        print(temp);
    }
    public static void main(String[] args) {

//
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);
//        a.next = b; b.prev=a;
//        b.next=c; c.prev=b;
//        c.next=d;d.prev=c;
//        d.next=e; e.prev=d;
//        print(a);
//        display(c);
        dll list=new dll();
        list.display();
        list.insertattail(10);
        list.insertattail(20);
        list.insertattail(30);
        list.insertattail(40);
        list.display();
        list.insertattail(50);
        list.display();
        list.insertathead(9);
        list.display();
        list.insert(3,11);
        list.display();
        list.delete(2);
        list.display();
    }
}