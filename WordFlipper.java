public class WordFlipper {
    Queue queue;

    public WordFlipper() {
        queue = new Queue();
    }

    public String flipInput(String input) {
        Stack wordStack = new Stack();
        
        char[] inputCharArray = input.toCharArray();

        for (int i = 0; i < inputCharArray.length; i++) {
            char c = inputCharArray[i];
            if (c == ' ' ) {
                if (!wordStack.isEmpty()) {
                    queue.enqueueStack(wordStack);
                    wordStack.emptyStack();
                }
                queue.enqueue(c);
            }

            else if (i == inputCharArray.length - 1) {
                wordStack.push(c);
                queue.enqueueStack(wordStack);
                wordStack.emptyStack();
            }  

            else {
               wordStack.push(c); 
            }
        }
        return queue.getStringFromList();
    }
}
