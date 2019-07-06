class Fibonacci
{
public static void main(String[] args)
{
int a=0,b=1,c=0;
for(;;)
{
c=a+b;
if(c>100)
break;
System.out.print(c+" ");
a=b;
b=c;
}
}
}
