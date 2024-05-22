import java.util.*;

public class multiplication {
    public static void main(String[] args) {
        int n;
        System.out.println("enter any number");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(+n + "*" + i + "=" + n * i);

        }
    }

}
