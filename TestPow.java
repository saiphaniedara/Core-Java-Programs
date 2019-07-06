import java.util.Scanner;
class TestPow
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter values for m and n to calculate m^n: ");
int m=sc.nextInt();
int n=sc.nextInt();
int res=1;
while(n>0)
{
res*=m;
n--;
}
System.out.println("Result="+res);
}
}

