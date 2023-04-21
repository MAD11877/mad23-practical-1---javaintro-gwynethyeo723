import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
     
    Scanner in = new Scanner(System.in);

    System.out.print("Enter height in metres: ");
    double height = in.nextDouble();

    System.out.print("Enter weight in kilograms: ");
    double weight = in.nextDouble();

    double bmi = weight/(height*height);
    
    System.out.printf("BMI (to 2 significant figures): %.2f", bmi); 

  }
}

