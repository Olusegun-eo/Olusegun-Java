package dataStructure;

public class MyStack {
    private  int returnNumberOfElements;
    private int [] elements;

    public MyStack(int capacity) {
        elements = new int[capacity];
    }


    public void add(int element) {
//        if(isFull()) throw new UnderFlowException("The stack is empty");
        try {
            elements[returnNumberOfElements] = element;
            returnNumberOfElements++;
        }
        catch(RuntimeException exception){
            throw new OverFlowException("The Stack is full");
        }
    }

    public boolean isFull() {
        return elements.length == size();
    }

    public int size() {
        return returnNumberOfElements;
    }

    public void pop() {
        if(isEmpty()) throw new UnderFlowException("The stack is empty");

        --returnNumberOfElements;
    }

    public boolean isEmpty() {
        return returnNumberOfElements == 0;
    }

    public int peek() {
        return elements[returnNumberOfElements -1];
    }

    public static class UnderFlowException extends RuntimeException {
        public UnderFlowException(String message){
            super(message);
        }
    }

    public static class OverFlowException extends RuntimeException {
        public OverFlowException(String message){
            super(message);
        }
    }
}
