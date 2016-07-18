public class Queue {
    int queueSize;
    Node head;
    Node tail;

    public void enqueue(char c) {
        Node newNode = new Node(c);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        queueSize++;
    }

    public void enqueueStack(Stack stack) {
        Node currentNode = stack.top;
        for (int i = 0; i < stack.getSize(); i++) {
            enqueue(currentNode.c);
            currentNode = currentNode.next;
        }
    }

    public char dequeue() {
        char item = head.c;
        head.next = head;
        queueSize--;
        return item;
    }

    public boolean isEmpty() {
        return queueSize == 0;
    }

    public int queueSize() {
        return queueSize;
    }

    public String getStringFromList() {
        char[] charArray = new char[queueSize];
        Node currentNode = head;
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = currentNode.c;
            currentNode = currentNode.next;
        }
        return new String(charArray);
    }
}
