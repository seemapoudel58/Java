import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("ENTER Values:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("sum = " + c);
    }
}
