import java.util.Scanner;
class Roots
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter values for a,b and c: ");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double de=(b*b)-(4*a*c);
double d=Math.sqrt(de);
if(de>0)
{
System.out.println("Roots are real and unequal");
double r1=(-b-d)/(2*a);
double r2=(-b+d)/(2*a);
System.out.println("Roots are: "+r1+" "+r2);
}
else
{
if(de==0)
{
System.out.println("Roots are real and equal");
double r1=(-b)/(2*a);
System.out.println("Roots are:"+r1+" "+r1);
}
else
System.out.println("Roots are complex");
}
}
}
