import java.util.*;
class project1
{
public Static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int o=0;
int k=0;
ArrayList al=new ArrayList();
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int b[]=new int[a.length];
for(int j=0;j<n;j++)
{
for(int k=0;k<j;k++)
{
if(a[j]==a[k])
break;
}
if(j==k)
{
b[o]=a[j];
o++;
}
}
for(int p=0;p<n;p++)
{
int count=0;
for(int q=0;q<a.length;q++)
{
if(b[p]==a[q])
{
count++;
}
}
if(count!=0)
al.add(b[p]);
}
System.out.println(al);
}
}
