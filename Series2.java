//To print the series 1 50 3 48 5 46 ......... 49 2
class Series2
{
public static void main(String[] args)
{
for(int i=1,j=50;i<50&&j>1;i+=2,j-=2)
{
System.out.print(i+" "+j+" ");
}
}
}