public class Stack {

    Node top;
    int size;

    public void push(char c) {
        top = new Node(c, top);
        size++;
    }

    public char pop() {
        char c = top.c;
        top = top.next;
        size--;
        return c;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void emptyStack() {
        top = null;
        size = 0;
    }
}
