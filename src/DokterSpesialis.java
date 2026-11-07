public class DokterSpesialis extends Dokter implements Pemeriksa {

    private String spesialisasi;

    //kontruktor 1 memanggil konstruktor dokter
    public DokterSpesialis(String idDokter, String namaDokter, String spesialisasi) {
        super(idDokter, namaDokter);
        this.spesialisasi = spesialisasi;
    }
    //konstruktor 2 overloadig
    public DokterSpesialis(String idDokter, String namaDokter, String spesialisasi, int kuotaHarian) {
        super(idDokter, namaDokter, kuotaHarian);
        this.spesialisasi = spesialisasi;
    }

    @Override
    public void tanganiPasien(Pasien pasien) {
        if (!pasien.getStatus().equals("dirujuk")) {
            System.out.println(pasien.getNama() + " ditolak, belum ada rujukan dari dokter umum.");
        } else if (getSisaKuota() <= 0) {
            System.out.println("Kuota spesialis habis, " + pasien.getNama() + " menunggu.");
        } else {
            periksa(pasien);
            pasien.setStatus("selesai");
            tambahPasienDitangani();
        }
    }
     @Override
    public void periksa(Pasien pasien) {
        System.out.println(getNamaDokter() + " (spesialis " + spesialisasi + ") memeriksa "
                + pasien.getNama() + " dengan diagnosis " + pasien.getPenyakit());
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis   : Dokter Spesialis " + spesialisasi);
    }

    //getter dan setter
    public String getSpesialisasi() { return spesialisasi; }
    public void setSpesialisasi(String spesialisasi) { this.spesialisasi = spesialisasi; }
}