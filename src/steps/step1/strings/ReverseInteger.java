package steps.step1.strings;

public class ReverseInteger {

  public static void main(String[] args) {
    ReverseInteger integer = new ReverseInteger();
    System.out.println(integer.reverse(123));
    System.out.println(integer.reverse(-123));
    System.out.println(integer.reverse(-120));
    System.out.println(integer.reverse(1534236469));
  }

  public int reverse(int x) {
    long reverse = 0;
    int tmp;
    while (x != 0) {
      tmp = x % 10;
      x = x / 10;
      reverse = reverse * 10 + tmp;
    }
    if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
      return 0;
    } else {
      return (int) reverse;
    }
  }
}
