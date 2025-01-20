package stacksthree;

// Implement a "growable" stack.
public class DynStack implements IntStack {
    private int[] stck;
    private int tos;

    // allocate and initialize stack
    public DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Push an item onto the stack
    public void push(int item) {
        // if stack is full, allocate a larger stack
        if (tos == stck.length - 1) {
            int[] temp = new int[stck.length * 2]; // double size
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
        }
        stck[++tos] = item;
    }

    // Pop an item from the stack
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }

    // Implement the clear method
    @Override
    public void clear() {
        tos = -1;
        System.out.println("Stack cleared.");
    }
}
