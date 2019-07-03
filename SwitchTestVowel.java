import java.util.Scanner;
class SwitchTestVowel
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character to test whether it is a vowel or not: ");
char c=sc.next().charAt(0);
c=Character.toUpperCase(c);
switch(c)
{
case 'A':
System.out.println("It is a vowel");
break;
case 'E':
System.out.println("It is a vowel");
break;
case 'I':
System.out.println("It is a vowel");
break;
case 'O':
System.out.println("It is a vowel");
break;
case 'U':
System.out.println("It is a vowel");
break;
default:
System.out.println("It is not a vowel");
break;
}
}
}