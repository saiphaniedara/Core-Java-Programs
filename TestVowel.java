import java.util.Scanner;
class TestVowel
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character to test whether it is a vowel or not:");
String a=sc.next();
char c=a.charAt(0);
c=Character.toLowerCase(c);//To convert character to lower case we use variable_name=Character.toLowerCase(variable_name)
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println("Entered Character is a vowel");
else
System.out.println("Not a vowel");
}
}
