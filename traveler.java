import java.util.*;

class traveler {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
int b[]=new int[num];
        for (int i = 0; i < num; i++) {
             b[i] = sc.nextInt();
            }
            Arrays.sort(b);
            System.out.println(b[0] + " " + b[1]);
        }
 }



