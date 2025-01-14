package stacks;
    
// An implementation of IntStack that uses dynamic storage.
public class DynStack implements IntStack {
    private int[] stack;
    private int tos;
    
    // Allocate and initialize stack
    public DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }
    
    // Push an item onto the stack
    public void push(int item) {
        // If stack is full, allocate a larger stack
        if (tos == stack.length - 1) {
            int[] temp = new int[stack.length * 2]; // double size
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
            stack[++tos] = item;
        } else {
            stack[++tos] = item;
        }
    }
    
    // Pop an item from the stack
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty.");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
