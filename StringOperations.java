//Sofia Mocuta
//083120
//AP CSA
public class StringOperations{
  public static void main(String args[]){

  //Challenge 1
  /*Code scrambles words by plcing the first half of the word behind the second one*/

    //First half
    String word = "computer";
    double wordLength = word.length();
    double firstHalfWordLength = wordLength/2;
    int fHWLRounded = (int) firstHalfWordLength;
    String firstHalf = word.substring(0,fHWLRounded);
    //Second half
    String secondHalf = word.substring(fHWLRounded);
    //full scramble 
    System.out.println(secondHalf.toLowerCase() + firstHalf.toLowerCase());

  //Challenge 2
  /*Code creates an ASCII art inspired image using 1 line of code*/
    String symbol = "     ________\n    /_______/\\\n    \\ \\    / /\n  ___\\ \\__/_/___\n /____\\ \\______/\\\n \\ \\   \\/ /   / /\n  \\ \\  / /\\  / /\n   \\ \\/ /\\ \\/ /\n    \\_\\/  \\_\\/";
    System.out.println(symbol);
  }
}