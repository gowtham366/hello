import java.io.*;
import java.util.Scanner;
class CamelCase
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        StringBuilder sb=new StringBuilder();
        String delimiter="'.,;!-/ ";
        boolean b=true;
        
        for(char c:str.toCharArray())
        {
            c=(b)?Character.toUpperCase(c):Character.toLowerCase(c);
            b=(delimiter.indexOf((int)c)>=0);
            if(b!=true)
            sb.append(c);
        }
        str=sb.toString();
        System.out.println(str);
    }
}
