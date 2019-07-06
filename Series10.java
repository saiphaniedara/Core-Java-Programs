/*
To print the output
1 1 1
2 4 8
3 9 27
-----
-----
-----
10 100 1000
*/
class Series10
{
public static void main(String[] args)
{
for(int i=1;i<=10;i++)
{
System.out.println(i+"\t"+(i*i)+"\t"+(i*i*i));
}
}
}