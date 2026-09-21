/**
 * LengthofLastWord
 */
public class LengthofLastWord {

  public static void main(String[] args) {
    String s = "Hello World";

    Solution.lengthOfLastWord(s);
  }

  class Solution {
    public static int lengthOfLastWord(String s) {
      String[] lastWord = s.split(" ");

      int last = lastWord[lastWord.length - 1].length();
      System.out.println(last);
      return last;
    }
  }
}
