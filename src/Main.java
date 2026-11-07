import com.sun.jdi.PathSearchingVirtualMachine;

public class Main {
    public static void main(String[] args) {
        System.out.println("RS      : " + Dokter.NAMA_RS);
        System.out.println();

        DokterUmum umum = new DokterUmum("U01", "dr. Andi", 3);
        DokterSpesialis spesialis = new DokterSpesialis("S01", "dr. Rudi", "Jantung");
        umum.tampilkanInfo();
        System.out.println();
        spesialis.tampilkanInfo();
        System.out.println();

        Pasien budi = new Pasien("Budi", "Flu");
        Pasien kaka = new Pasien ("kaka","Gagal Jantung",8);
        Pasien siti = new Pasien("Siti", "Gagal Jantung", 9);

        umum.tanganiPasien(budi);        // ringan -> selesai
        umum.tanganiPasien(kaka);        // berat -> dirujuk
        umum.tanganiPasien(siti);        // berat -> dirujuk
        spesialis.tanganiPasien(siti);   // dirujuk -> selesai
        spesialis.tanganiPasien(kaka);   // dirujuk -> selesai dong
        spesialis.tanganiPasien(budi);   // belum dirujuk -> ditolak

        // Polimorfisme interface
        Perujuk perujuk = new DokterUmum("U02", "dr. Sari");
        perujuk.rujuk(new Pasien("Joko", "Stroke", 9));
        Pemeriksa pemeriksa = new DokterSpesialis("S02", "dr. Tono", "Saraf"); pemeriksa.periksa(siti);


    }
}