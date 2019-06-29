import java.util.Scanner;
class Circle
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the circle:");
double rad=sc.nextDouble();
final double pi=3.14;
double area=pi*rad*rad;
System.out.println("Area of circle="+area);
}
}