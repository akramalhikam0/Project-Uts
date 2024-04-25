import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> daftarBarang = new HashMap<>();
        daftarBarang.put("Beras", 10000);
        daftarBarang.put("Gula", 8000);
        daftarBarang.put("Minyak", 15000);

        System.out.println("Daftar Barang:");
        for (String barang : daftarBarang.keySet()) {
            System.out.println(barang + " - Harga: Rp" + daftarBarang.get(barang));
        }

        System.out.println("Silakan pilih barang yang ingin Anda beli:");
        String barangPilihan = scanner.nextLine();

        if (daftarBarang.containsKey(barangPilihan)) {
            System.out.print("Masukkan jumlah " + barangPilihan + " yang ingin Anda beli: ");
            int jumlah = scanner.nextInt();

            int hargaTotal = daftarBarang.get(barangPilihan) * jumlah;
            System.out.println("Total harga belanjaan Anda adalah Rp" + hargaTotal);
        } else {
            System.out.println("Barang tidak tersedia.");
        }

        scanner.close();
    }
}
