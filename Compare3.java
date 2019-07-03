import java.util.Scanner;
class Compare3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three distinct numbers a,b and c to compare:");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
if(a>b&&a>c)
System.out.println("Maximum="+a);
else
{
if(b>c)
System.out.println("Maximum="+b);
else
System.out.println("Maximum="+c);
}
}
}