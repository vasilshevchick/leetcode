package steps.step1.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public static void main(String[] args) {
    FizzBuzz fizzBuzz =new FizzBuzz();
    System.out.println(fizzBuzz.fizzBuzz(15));
  }

  public List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>();
    for (int i = 1; i < n + 1; i++) {
      int fizz = i % 3;
      int buzz = i % 5;
      if (fizz == 0 && buzz == 0) {
        result.add("FizzBuzz");
      } else if (fizz == 0) {
        result.add("Fizz");
      } else if (buzz == 0) {
        result.add("Buzz");
      } else {
        result.add(String.valueOf(i));
      }
    }
    return result;
  }
}
