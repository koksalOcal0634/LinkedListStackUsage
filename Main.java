public class Main {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is " + stack.peek());
    }
    }
    

