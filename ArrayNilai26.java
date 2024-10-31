import java.util.Scanner;
public class ArrayNilai26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukan NIlai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("NIlai akhir ke-"+1+" adalah "+nilaiAkhir[i]);
        }
    }
}