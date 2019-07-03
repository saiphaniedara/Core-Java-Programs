import java.util.Scanner;
class SimpleInterest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter values of P,Tand R to calculate Simple Interest: ");
double p=sc.nextDouble();
double t=sc.nextDouble();
double r=sc.nextDouble();
double si=(p*t*r)/100;
System.out.println("Simple Interest="+si);
}
}