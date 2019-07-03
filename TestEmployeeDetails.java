import java.util.Scanner;
class TestEmployeeDetails
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Marital Status, Gender and Age of an Employee: ");
String maritalStatus=sc.next();
String gender=sc.next();
int age=sc.nextInt();
if(maritalStatus.equals("married"))
{
if((gender.equals("male")&&age>=35)||(gender.equals("female")&&age>=30))
System.out.println("Employee is Insured");
else
System.out.println("Employee is not Insured");
}
else
System.out.println("Employee is not Insured");
}
}
