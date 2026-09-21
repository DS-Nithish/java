/**
 * StringManipulation
 */
public class StringManipulation {

  public static void main(String[] args) {

    String s = "I Love Java22";
    String p = "qereqwrq";
    String i = "He did a good deed";
    System.out.println(space(s));
    Reverse(s);
    Palindrome(p);
    IsPalindromeOnly(i);

  }

  /**
     
  
  */

  public static void IsPalindromeOnly(String e) {
    // He did a good deed
    String s = "He did a good deed";
    String[] words = s.split(" ");

    for (String word : words) {

      int l = 0;
      int r = word.length() - 1;
      boolean palindrome = true;

      while (l < r) {
        if (word.charAt(l) != word.charAt(r)) {
          palindrome = false;
          break;
        }

        l++;
        r--;
      }

      if (!palindrome) {
        System.out.println(word);
      }
    }
  }

  public static void Palindrome(String s) {
    char[] arr = s.toCharArray();

    int l = 0;
    int r = arr.length - 1;

    while (l < r) {
      if (arr[l] == arr[r]) {
        l++;
        r--;
      } else {
        System.out.println("Not a Palindrome");
        break;
      }
    }
  }

  public static void Reverse(String s) {

    char[] arr = s.toCharArray();

    int l = 0;
    int r = arr.length - 1;

    while (l < r) {

      char temp = arr[l];
      arr[l] = arr[r];
      arr[r] = temp;

      l++;
      r--;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static int space(String s) {
    int count = 0;
    int digits = 0;
    int letter = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= '0' && c <= '9') {
        digits++;
      } else if (Character.isLetter(c)) {
        count++;
      }

    }
    return digits + count + letter;
  }
}
