import java.util.Scanner;
class TestTriangle
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a,b and c sides of a Triangle:");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
if(a==b&&a==c)
System.out.println("Given sides are of Equilateral Triangle");
else
{
if(a==b||b==c||a==c)
System.out.println("Given sides are of Isosceles Triangle");
else
System.out.println("Given sides are of Scalene Triangle");
}
}
}
