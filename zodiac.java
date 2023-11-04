import java.util.Scanner;
public class zodiac {

    public static void main(String[] args) {
       
        int tanggal, bulan;
        String zodiak = null;


        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan tanggal lahir: ");
        tanggal = input.nextInt();


        System.out.print("Masukkan bulan lahir: ");
        bulan = input.nextInt();


        switch (bulan) {
            case 1:
                if (tanggal <= 19) {
                    zodiak = "Capricorn";
                } else {
                    zodiak = "Aquarius";
                }
                break;
            case 2:
                zodiak = "Aquarius";
                break;
            case 3:
                if (tanggal <= 20) {
                    zodiak = "Pisces";
                } else {
                    zodiak = "Aries";
                }
                break;
            case 4:
                zodiak = "Aries";
                break;
            case 5:
                if (tanggal <= 20) {
                    zodiak = "Taurus";
                } else {
                    zodiak = "Gemini";
                }
                break;
            case 6:
                zodiak = "Gemini";
                break;
            case 7:
                if (tanggal <= 22) {
                    zodiak = "Cancer";
                } else {
                    zodiak = "Leo";
                }
                break;
            case 8:
                zodiak = "Leo";
                break;
            case 9:
                if (tanggal <= 22) {
                    zodiak = "Virgo";
                } else {
                    zodiak = "Libra";
                }
                break;
            case 10:
                zodiak = "Libra";
                break;
            case 11:
                if (tanggal <= 21) {
                    zodiak = "Scorpio";
                } else {
                    zodiak = "Sagitarius";
                }
                break;
            case 12:
                zodiak = "Sagitarius";
                break;
        }

        // Tampilkan hasil
        System.out.println("Zodiak Anda adalah: " + zodiak);
    }
}