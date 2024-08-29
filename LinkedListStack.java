class Node{
    // Node class to represent each element in the stack
    int data;
    Node next;

    public Node(int data){
        this.next = null;
        this.data = data;
    }

}


public class LinkedListStack{
    private Node top;

    public LinkedListStack(){
        this.top = null;
    }
    // method to pop an element from the stack
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedOut = top.data;
        top = top.next;
        System.out.println(poppedOut + " removed from the stack");
        return  poppedOut;

      
    }
    // method to push an element onto stack
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed onto stack");
    }

    public boolean isEmpty(){
      if(top==null){
        return false;
      }
      return  false;
      
    }
    // Method to peek at the top element of the stack
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;

    }

}