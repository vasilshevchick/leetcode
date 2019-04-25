package steps.step1.strings;

public class StringtoInteger {

  public static void main(String[] args) {
    int min = -Integer.MIN_VALUE;
    System.out.println(min);
    //    String input1 = "42";
    String input2 = "   -42";
    String input3 = "4193 with words";
    String input4 = "+1";
    String input5 = "9223372036854775808";
    StringtoInteger solution = new StringtoInteger();
    //    System.out.println(solution.myAtoi(input1));
    //    System.out.println(solution.myAtoi(input2));
    //    System.out.println(solution.myAtoi(input3));
    //    System.out.println(solution.myAtoi(input4));
    System.out.println(solution.myAtoi(input5));
  }

  public int myAtoi(String str) {
    if (str == null) { return 0; }
    int i = 0;
    boolean sign = true;
    str = str.trim();
    int n = str.length();
    if (i < n && (str.charAt(0) == '+' || str.charAt(0) == '-')) {
      if (str.charAt(0) == '+') { sign = true; } else { sign = false; }
      ++i;
    }
    int res = 0;
    while (i < n && Character.isDigit(str.charAt(i))) {
      if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10
                                           && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
        return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      res = res * 10 + str.charAt(i) - 48;
      ++i;
    }
    return sign ? res : -res;
  }
}
