import java.util.Scanner;
class TestPowDW
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter m and n values:");
int m=sc.nextInt();
int n=sc.nextInt();
int mn=1;
do
{
mn*=m;
n--;
}while(n>=1);
System.out.println("m^n="+mn);
}
}
