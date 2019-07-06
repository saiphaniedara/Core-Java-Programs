import java.util.Scanner;
class TestArmstrong
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int a=sc.nextInt();
int b=a,arm=0;
while(a>0)
{
int x=a%10;
arm+=(x*x*x);
a=a/10;
}
if(arm==b)
{
System.out.println("Is a Armstrong number");
}
else
{
System.out.println("Not an Armstrong number");
}
}
}
