import java.io.*;
import java.util.Scanner;
class subset
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int count=0;
        int[] a1=new int[]{2,3,4};
        int[] a2=new int[]{1,2,3,4,5,6};
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i]==a2[j])
                {
                    count+=1;
                }
            }
        }
        if(count==a1.length)
        {
            System.out.println(" a1 is a subset of a2");
        }
        else
        {
            System.out.println("a1 is not a subset of a2");
        }
    }
}

