    import java.util.Scanner;

    public class TugasSoal2 {

        // Untuk menampilkan opsi menu
        public static void tampilkanMenu() {
            System.out.println("Pilih bangun datar:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.print("Masukkan pilihan Anda: ");
        }

        // Untuk menghitung luas dan keliling bangun geometri
        public static class BangunDatar {

            // Untuk menghitung luas dan keliling persegi
            public static void luasKelilingPersegi(double sisi) {
                double luas = sisi * sisi;
                double keliling = 4 * sisi;
                System.out.println("Luas persegi: " + luas);
                System.out.println("Keliling persegi: " + keliling);
            }

            // Untuk menghitung luas dan keliling persegi panjang
            public static void luasKelilingPersegiPanjang(double panjang, double lebar) {
                double luas = panjang * lebar;
                double keliling = 2 * (panjang + lebar);
                System.out.println("Luas persegi panjang: " + luas);
                System.out.println("Keliling persegi panjang: " + keliling);
            }

            // Untuk menghitung luas dan keliling lingkaran
            public static void luasKelilingLingkaran(double jariJari) {
                double luas = Math.PI * jariJari * jariJari;
                double keliling = 2 * Math.PI * jariJari;
                System.out.println("Luas lingkaran: " + luas);
                System.out.println("Keliling lingkaran: " + keliling);
            }
        }

        // untuk mendapatkan masukan pengguna untuk dimensi persegi
        public static double inputSisi(Scanner scanner) {
            System.out.print("Masukkan sisi persegi: ");
            return scanner.nextDouble();
        }

        // untuk mendapatkan masukan pengguna untuk dimensi persegi panjang
        public static double inputPanjang(Scanner scanner) {
            System.out.print("Masukkan panjang persegi panjang: ");
            return scanner.nextDouble();
        }

        // untuk mendapatkan input pengguna untuk lebar persegi panjang
        public static double inputLebar(Scanner scanner) {
            System.out.print("Masukkan lebar persegi panjang: ");
            return scanner.nextDouble();
        }

        // untuk mendapatkan masukan pengguna untuk radius lingkaran
        public static double inputLingkaran(Scanner scanner) {
            System.out.print("Masukkan jari-jari lingkaran: ");
            return scanner.nextDouble();
        }

        // untuk memproses bentuk yang dipilih dan memanggil metode perhitungan
        public static void prosesPilihan(int pilihan, Scanner scanner) {
            switch (pilihan) {
                case 1:
                    // Persegi
                    double sisi = inputSisi(scanner);
                    BangunDatar.luasKelilingPersegi(sisi);
                    break;
                case 2:
                    // Persegi Panjang
                    double panjang = inputPanjang(scanner);
                    double lebar = inputLebar(scanner);
                    BangunDatar.luasKelilingPersegiPanjang(panjang, lebar);
                    break;
                case 3:
                    // Lingkaran
                    double jariJari = inputLingkaran(scanner);
                    BangunDatar.luasKelilingLingkaran(jariJari);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Menampilkan menu ke pengguna
            tampilkanMenu();

            // Membaca pilihan pengguna
            int pilihan = scanner.nextInt();

            // untuk memanggil atau memproses pilihan pengguna dan mendapatkan masukan
            prosesPilihan(pilihan, scanner);

            //untuk menutup pemindaian
            scanner.close();
        }
    }