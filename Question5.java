import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
     
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter an whole number: "); //prompting user for number
    int noOfInt = in.nextInt();
    int [] numarr = new int[noOfInt];
    
    for (int i = 0; i<noOfInt; i++) //using a for loop and print out the numbers that the person gave 
    {
      int num = in.nextInt();
      numarr[i] = num; 
      //System.out.print(">"+num);
    }

    int max = 0;
    int mode = 0;

    for (int i = 0; i<noOfInt; i++)
    {
      int counter = 0;
      for (int j = 0; j<noOfInt; j++)
      {
        if (numarr[j]==numarr[i]) //comparing the number with other numbers 
        {
          counter ++;
        }
        if (counter>max) //count which number is repeated the most
        {
          max = counter;
          mode = numarr[i];
        }
      }
    }
    System.out.println(mode);
  }
}
