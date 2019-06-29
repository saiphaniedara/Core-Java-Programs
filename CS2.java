import java.util.Scanner;
class CS2
 {
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two numbers that you want to compare:");
  int a=sc.nextInt();
  int b=sc.nextInt();
  if(a>b)
   System.out.println("a is greater than b");
  else
    if(a<b)
     System.out.println("a is less than b");
    else
     System.out.println("a and b are the same");
   }
 }
