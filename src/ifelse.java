import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan apa saja (0 untuk keluar): ");
        int bilangan = scanner.nextInt();

        while (bilangan != 0) {
            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " adalah kelipatan 2.");
            } else {
                System.out.println(bilangan + " bukan kelipatan 2.");
            }

            System.out.print("Masukkan bilangan apa saja (0 untuk keluar): ");
            bilangan = scanner.nextInt();
        }

        System.out.println("Terima kasih.");
    }
}