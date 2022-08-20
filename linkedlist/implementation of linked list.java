import java.util.*;

 class LinkedList{
      Node head;
      class Node{
         int data;
         Node next;
         Node(int val){
             data=val;
             next=null;
         }
      }
      LinkedList(){
          head=null;
      }
      
      public void insertAtBeginning(int val){
          Node node=new Node(val);
          if(head==null) head=node;
          else{
              node.next=head;
              head=node;
          }
      }
      
      public void insertAtMiddle(int pos,int val){
          Node node=new Node(val);
          Node temp=head;
          for(int i=1;i<=pos;i++){
              temp=temp.next;
          }
          node.next=temp.next;
          temp.next=node;
      }
      
      public void insertAtEnd(int val){
          Node node=new Node(val);
          Node temp=head;
          while(temp.next!=null){
              temp=temp.next;
          }
          temp.next=node;
      }
      
      public void deleteAt(int pos){
          if(head==null) {
              System.out.print("Exception");
          }
          Node temp=head,prev=null;
          if(pos==0) head=head.next;  // first position
          else{
              for(int i=1;i<=pos;i++){
              prev=temp;
              temp=temp.next;
              }
              prev.next=temp.next;
          }
      }
      
      public void display(){
          Node temp=head;
          while(temp!=null){
              System.out.println(temp.data);
              temp=temp.next;
          }
      }
      
      
      
}

public class Main
{
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insertAtBeginning(8);
		list.insertAtBeginning(7);
		list.insertAtBeginning(6);
		list.insertAtMiddle(2,7);
		list.insertAtEnd(9);
		list.display();
	}
}
