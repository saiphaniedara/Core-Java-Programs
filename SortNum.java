import java.util.Scanner;
class SortNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers that you want to sort in ascending order:");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
if(a>b)
{
if(b>c)
System.out.println(c+" "+b+" "+a);
else
System.out.println(b+" "+c+" "+a);
}
else
{
if(b>c)
{
if(a>c)
System.out.println(c+" "+a+" "+b);
else
System.out.println(a+" "+c+" "+b);
}
else
{
if(b>a)
System.out.println(a+" "+b+" "+c);
else
System.out.println(b+" "+a+" "+c);
}
}
}
}
