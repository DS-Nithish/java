public class ReverseVowelsOfaString {
  public static void main(String[] args) {
    String s = "IceCreAm";
    reverseVowels(s);
  }

  public static String reverseVowels(String s) {
    char[] lower = s.toCharArray();
    int l = 0;
    int r = s.length() - 1;
    String vowels = "aeiou";
    boolean leftIsVowel = vowels.indexOf(s.charAt(l)) == -1;
    boolean rightIsVowel = vowels.indexOf(s.charAt(r)) == -1;

    while (l < r) {
      while (l < r && leftIsVowel) {
        l++;
      }
      ;
      while (l < r && rightIsVowel) {
        r--;
      }
      ;
      char temp = lower[l];
      lower[l] = lower[r];
      lower[r] = temp;
      l++;
      r--;

    }
    String result = new String(lower);
    return result;
  }
}
