class ArgsDemo
{
public static void main(String[] args)
{
if(args.length!=2)
{
System.out.println("The format is : java ArgsDemo <arg1> <arg2>");
System.exit(1);
}
System.out.println("First argument is"+args[0]);
System.out.println("Second argument is"+args[1]);
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=a+b;
System.out.println("sum="+c);
}
}

