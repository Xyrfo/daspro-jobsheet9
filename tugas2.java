import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Mie Goreng", "Geprek", "Es Teh", "Es Jeruk"};
        double[] harga = {5000, 10000, 3000, 3000};

        System.out.println("Menu yang tersedia:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + ": Rp " + harga[i]);
        }

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] totalHarga = new double[jumlahPesanan];


        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            String pesanan = sc.nextLine();
            boolean valid = false;

            for (int j = 0; j < menu.length; j++) {
                if (pesanan.equalsIgnoreCase(menu[j])) {
                    namaPesanan[i] = pesanan;
                    totalHarga[i] = harga[j];
                    valid = true;
                    break;
                }
            }

            if (!valid) {
                System.out.println("Pesanan tidak tersedia, silakan pilih dari menu.");
                i--;
            }
        }

        double totalBiaya = 0;
        for (double hargaPesanan : totalHarga) {
            totalBiaya += hargaPesanan;
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(namaPesanan[i] + ": Rp " + totalHarga[i]);
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
