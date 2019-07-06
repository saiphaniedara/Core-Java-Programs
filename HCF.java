import java.util.Scanner;
class HCF
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers to find the H.C.F=");
int a=sc.nextInt();
int b=sc.nextInt();
if(b>a)
{
int temp=a;
a=b;
b=temp;
}
for(int c=b;c>=1;c--)
{
if(a%c==0&&b%c==0)
{
System.out.println("H.C.F of "+a+" "+b+" is "+c);
break;
}
}
}
}