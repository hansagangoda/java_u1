import java.util.ArrayList; //pro7

public class Stack {
    
    private ArrayList<Integer> stack;

    
    public Stack() {
        stack = new ArrayList<>();
    }

    
    public void push(int value) {
        stack.add(value);
    }

    
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return stack.remove(stack.size() - 1);
    }

    
    public void traverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    
    public static void main(String[] args) {
        Stack stack = new Stack();

        
        stack.push(11);
        stack.push(22);
        stack.push(33);

        
        System.out.println("After pushing 11, 22, and 33:");
        stack.traverse();

        
        System.out.println("\nPopped element: " + stack.pop());

        
        System.out.println("\nAfter popping one element:");
        stack.traverse();

    
        System.out.println("\nAttempting to pop from an empty stack:");
        stack.pop(); 
    }
}
