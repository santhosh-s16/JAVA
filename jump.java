import java.util.*;
class Jump {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of steps: ");
int n = sc.nextInt();       
int jump = JumpCount(n);       
System.out.println("Total number of jumps: " + jump);       
sc.close();
}
public static int JumpCount(int n) 
{
int jump = 0;
while (n > 0) 
{
if (n % 2 == 1) 
{
jump++;
n -= 1;
}
else 
{ 
jump++;
n /= 2;
}
}        
return jump;
}
}
