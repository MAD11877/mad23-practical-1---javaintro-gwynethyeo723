import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer for the base of the triangle: ");
    int number = in.nextInt();

    System.out.println(">"+number);

    for (int j = number; j > 0 ; j = j - 1)
    {
      for (int i = 0; i < j; i = i + 1)
    {
      System.out.print("*");
    }
    System.out.println();
    }
    
  }
}
