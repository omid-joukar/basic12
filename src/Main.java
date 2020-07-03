import java.util.Scanner;

/**
 * Created by KPS on 7/3/2020.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("please enter another number");
        int b = scanner.nextInt();
        System.out.println("please enter a number");
        int c = scanner.nextInt();
        System.out.print("please enter another number");
        int d = scanner.nextInt();
        System.out.println("please enter a number");
        int e = scanner.nextInt();
        System.out.println("average : "+(a+b+c+d+e)/5);
    }
}
