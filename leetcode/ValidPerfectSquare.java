public class ValidPerfectSquare {
  public static void main(String[] args) {
    int num = 2147483647;
    boolean f = Solution.isPerfectSquare(num);
    System.out.println(f);
    System.out.println(Integer.MAX_VALUE);
  }

  class Solution {
    public static boolean isPerfectSquare(int num) {
      boolean sqr = false;

      if (num * 0.25 == Math.floor(num * 0.25)) {
        System.out.println("ddd");
        sqr = true;
      }
      return sqr;
    }
  }
}
