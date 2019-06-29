import java.util.Scanner;
class TestEven
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an integer:");
    int a=sc.nextInt();
    if(a%2==0)
      System.out.println("The number entered is an even number");
    else
      System.out.println("Entered number is not an even number");
  }
}