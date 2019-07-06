import java.util.Scanner;
class TestPalindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number=");
int a=sc.nextInt();
int rev=0,b=a;
while(b>0)
{
rev=rev*10+b%10;
b=b/10;
}
if(rev==a)
{
System.out.println("Is a Palindrome");
}
else
{
System.out.println("Not a Palindrome");
}
}
}
