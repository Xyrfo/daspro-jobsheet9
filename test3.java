import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        
        System.out.print("Masukan jumlah mahasiswa : ");
        total = sc.nextInt();

        int[] nilaiMhs= new int[total];
        int lulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }
        System.out.println("Mahasiswa yang lulus : "+lulus);
    }
}