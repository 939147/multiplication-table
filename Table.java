import java.util.*;
import java.lang.*;
class Table
{
public static void main(String[]args)
{
int a,b,i;
Scanner s=new Scanner(System.in);
System.out.println("enter a vlaue");
a=s.nextInt();
for(i=1;i<=10;i++)
{
b=i*a;
System.out.println(a+"*"+i+"="+b);
}
}
}