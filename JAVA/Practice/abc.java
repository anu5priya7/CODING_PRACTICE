import java.util.*;

public class abc {
    
    static class Node{
         int data;
         Node next;
         Node(int data){
            this.data=data;
            this.next=null;
         }
    }

    static class stack1{
       static Node head = null;

       public boolean isEmpty(){
        return head==null;
       }
     
       //push
       public void push(int data){
          Node newNode = new Node(data);

         if(isEmpty()) {
            head=newNode;
            return;
         }
       
         newNode.next = head;
         head = newNode;         

       }

   //pop
   public int pop() {
            if(isEmpty()) {
                return -1;

            }
            int top = head.data;
            head= head.next;
            return top;
   }

   //peek
   public int peek() {

    if(isEmpty()){
        return -1;
    }

    return head.data;
   }

    }
   
    public static void main(String args[]){
        stack1 s = new stack1();
        s.push(1);
        s.push(2);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }



    }

}
