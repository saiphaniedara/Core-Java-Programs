import java.util.Scanner;
class Rectangle
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter length of the rectangle:");
int l=sc.nextInt();
System.out.println("Enter breadth of the rectangle:");
int b=sc.nextInt();
double area,perimeter;
area=l*b;
perimeter=2*(l+b);
System.out.println("Area="+area);
System.out.println("Perimeter="+perimeter);
}
}
