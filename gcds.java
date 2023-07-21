import java .util.*;
public class gcds {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
  int g = gcd( n1, n2);
  System.out.printf("G.C.D of %d and %d is %d.", n1, n2, g);
 }
public static int gcd(int n1, int n2)
{
  if (n2 != 0)
     return gcd(n2, n1 % n2);
  else
      return n1;
}
}