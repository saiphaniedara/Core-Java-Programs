import java.util.Scanner;
class CompoundInterest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter values for P,T and R to calculate Compound Interest: ");
double p=sc.nextDouble();
double t=sc.nextDouble();
double r=sc.nextDouble();
double ci=(Math.pow((1+r/100),t)-1)*p;
System.out.println("Compound Interest="+ci);
}
}