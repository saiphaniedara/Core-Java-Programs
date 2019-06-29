import java.util.Scanner;
class SI
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter values for P, T and R :");
float p=sc.nextFloat();
float t=sc.nextFloat();
float r=sc.nextFloat();
float si=(p*t*r)/100;
System.out.println("Simple interest="+si);
}
}
