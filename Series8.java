/*
To print the series
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
class Series8
{
public static void main(String[] args)
{
for(int i=1,j=1;i<=5;i++)
{
for(int k=1;k<=i;k++,j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}