import java.util.Scanner;
class Compare
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers a and b that you want to compare : ");
double a=sc.nextDouble();
double b=sc.nextDouble();
if(a>b)
System.out.println("a is greater than b");
else 
{
if(a<b)
System.out.println("b is greater than a");
else
System.out.println("a and b are equal");
}
}
}