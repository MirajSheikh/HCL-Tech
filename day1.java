
/**
 * day1
 */
// write a program to make a calculator where user enters symbol
import java.util.Scanner;

public class day1 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = 40;
    int b = 10;
    String userInput = s.next();
    if (userInput == "+") {
      System.out.println("Sum is : " + (a + b));
    } else if (userInput == "-") {
      System.out.println("Difference is : " + (a - b));
    } else if (userInput == "*") {
      System.out.println("Product is : " + (a * b));
    } else if (userInput == "/") {
      System.out.println("Quotient is : " + (a / b));
    } else {
      System.out.println("Invalid Input");
    }
    s.close();
  }

}
