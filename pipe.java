import java.util.Scanner;
class pipe 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
int r = sc.nextInt();
int[] arr1 = new int[n];
int[] arr2 = new int[m];
int a = 0;
int b = 0;
for (int i = 0; i < n; i++) 
{
arr1[i] = sc.nextInt();
a += arr1[i] - r;
}
for (int i = 0; i < m; i++) 
{
arr2[i] = sc.nextInt();
b += arr2[i] - r;
}
int res = (a - b) + r;
System.out.println("result: " + res);
}
}

