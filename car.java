import java.util.Scanner;

class car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int e1 = sc.nextInt();

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
        int e2 = sc.nextInt();

        int pet, die, res;
        pet = c1 + (e1 * 60) + (b1 * d1) / a1;
        die = c2 + (e2 * 60) + (b2 * d2) / a2;

        if (pet > die)
            System.out.println("Diesel is best");
        else
            System.out.println("Petrol is best");
    }
}
