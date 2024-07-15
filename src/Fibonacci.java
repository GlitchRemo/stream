// Find 10 fibonacci that are even
// Find even fibonacci within 10 fibonacci terms

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Fibonacci {
  private static void findFibonacci() {
    ArrayList<Integer> fibonacci = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229));

    Stream<Integer> tenEvenFibo = fibonacci.stream().filter(n -> n % 2 == 0).limit(10);
    Stream<Integer> evenFiboWithinTenTerms = fibonacci.stream().limit(10).filter(n -> n % 2 == 0);

    System.out.println(Arrays.toString(tenEvenFibo.toArray()));
    System.out.println(Arrays.toString(evenFiboWithinTenTerms.toArray()));
  }
  private static void shortCircuiting() {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 8, 3, 4));

    Stream<Integer> mappedStream = numbers.stream().map(n -> {
      System.out.println("Mapped " + n);
      return n + 1;
    });

    System.out.println("Find any " + Arrays.toString(mappedStream.toArray()));
  }

  public static void main(String[] args) {
    findFibonacci();
    shortCircuiting();
  }


}
