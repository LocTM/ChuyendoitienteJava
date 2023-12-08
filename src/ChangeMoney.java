import java.sql.SQLOutput;
import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000.00;
        System.out.println("Nhap vao gia tri $: ");
        double usdValue = scanner.nextDouble();

        double vndValue = usdValue * rate;
        System.out.println(usdValue + "USD" + "=" + vndValue + "VND");

        scanner.close();
    }
}
