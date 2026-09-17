/**
 * StringManipulation
 */
public class StringManipulation {

  public static void main(String[] args) {

    String s = "I Love Java";
    System.out.println(space(s));

  }

  public static int space(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == ' ') {
        count++;
      }
    }
    return count;
  }
}
