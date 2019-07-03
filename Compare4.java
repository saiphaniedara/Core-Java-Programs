import java.util.Scanner;
class Compare4 
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a,b,c and d values to find maximum:");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d=sc.nextDouble();
if(a>b&&a>c&&a>d)
System.out.println("Maximum="+a);
else
{
if(b>c&&b>d)
System.out.println("Maximum="+b);
else
{
if(c>d)
System.out.println("Maximum="+c);
else
System.out.println("Maximum="+d);
}
}
}
}