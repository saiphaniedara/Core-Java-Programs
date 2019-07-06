import java.util.Scanner;
class TestPrime
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=sc.nextInt();
int b=a/2;
Boolean isPrime=true;
while(b>1)
{
if(a%b==0)
{
isPrime=false;
break;
}
b-=1;
}
if(isPrime)
{
System.out.println("Is a Prime Number.");
}
else
{
System.out.println("Not a Prime Number.");
}
}
}
