package steps.step1.strings;

public class ReverseString {

  public static void main(String[] args) {
    ReverseString reverseString = new ReverseString();
    char[] array1 = {'h', 'e', 'l', 'l', 'o'};
    char[] array2 = {'H', 'a', 'n', 'n', 'a', 'h'};
    reverseString.reverseString(array1);
    reverseString.reverseString(array2);
    System.out.println(array1);
    System.out.println(array2);
  }

  public void reverseString(char[] s) {
    char tmp;
    for (int i = 0; i < s.length / 2; i++) {
      tmp = s[i];
      s[i] = s[s.length - 1 - i];
      s[s.length - 1 - i] = tmp;
    }
  }
}
