import java.util.Scanner;

public class NoConservativeEyes 
{
	
static Scanner sc=new Scanner(System.in);
	
public int[] fp(int m,int n)
{
		
int q[]=new int[n/2];
int c=0;
for(int i=m;i<=n;i++)
{
for(int j=i/2;j>0;j--)
{
if(j==1)
{
q[c]=i;
c++;
}
if(i%j==0)
break;
}
}
return q;	
}	
	
public static void main(String[] args) 
{
		
int m=sc.nextInt();
		
int n=sc.nextInt();
		
int count=0;
		
int p[];
		
int i=m,j=n;
		
NoConservativeEyes nce=new NoConservativeEyes();
		
p=nce.fp(i,j);
for(int k=0;k<p.length;k++)
{
for(int l=k+1;l<p.length;l++)
{
if((p[l]-p[k])==6)
count++;
}
}	
System.out.println(count);
		
	
	
}

}