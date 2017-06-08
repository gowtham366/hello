import java.io.*;
import java.util.Scanner;
class stringreplace
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String str=s.nextLine();
char[] c=str.toCharArray();
int len=c.length;
if(len%2!=0)
{
for(int i=0;i<len-1;i=i+2)
{
char temp=c[i];
c[i]=c[i+1];
c[i+1]=c[i];
}
}
else
{
for(int i=0;i<len;i=i+2)
{
char temp=c[i];
c[i]=c[i+1];
c[i+1]=temp;
}
}
for(int i=0;i<len;i++)
{
System.out.print(c[i]);
}
}
}
