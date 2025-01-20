package stacksthree;

public interface IntStack {
    void push(int item); // store an item
    int pop(); // retrieve an item

    // A default method that returns an array that contains the top n elements on the stack.
    default int[] popNElements(int n) {
        return getElements(n);
    }

    // A default method that returns an array that contains the next n elements on the stack after skipping elements.
    default int[] skipAndPopNElements(int skip, int n) {
        getElements(skip);
        return getElements(n);
    }

    // A private method that returns an array containing the top n elements on the stack.
    private int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 0; i < n; i++)
            elements[i] = pop();
        return elements;
    }
    
    default void clear() {
        System.out.println("clear() not implemented.");
    }
}