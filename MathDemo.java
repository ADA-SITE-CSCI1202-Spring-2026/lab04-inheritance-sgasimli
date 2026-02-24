import java.util.Scanner;

public class MathDemo {
  public static int min(int a, int b) {
    return (a <= b) ? a : b;
  }
  public static int max(int a, int b) {
    return (a > b) ? a : b;
  }
  public static int sum(int[] args) {
    int sum = 0;
    for(int i : args) {
      sum += i;
    }
    return sum;
  }
  public static float mean(int args[]) {
    return (float)MathDemo.sum(args) / args.length;
  }
  public static int factorial(int n) {
    int res = 1;
    for(int i = 1; i <= n; i++) {
      res *= i;
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    int[] arr = {a, b, b, a};
    System.out.println(MathDemo.min(a, b));
    System.out.println(MathDemo.max(a, b));
    System.out.println(MathDemo.sum(arr));
    System.out.println(MathDemo.mean(arr));
    System.out.println(MathDemo.factorial(a));
  }
}
