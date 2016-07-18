public class ReverseWords {
    public static void main (String args[]) {
        String input;
        
        try {
            input = args[0];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            input = "These pretzels are making me thirsty!";
        }

        WordFlipper wordFlipper = new WordFlipper();
        String flippedInput = wordFlipper.flipInput(input);
        System.out.println(flippedInput);
    }
}
