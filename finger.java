import java.util.*;
public class finger
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%8==1)
System.out.println("thumb");
else if(n%8==2 || n%8==10)
System.out.println("index");
else if(n%8==3 || n%8==7)
System.out.println("middle");
else if(n%8==4 || n%8==6)
System.out.println("ring");
else 
System.out.println("little");
}
}