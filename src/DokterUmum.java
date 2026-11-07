public class DokterUmum extends Dokter implements Pemeriksa, Perujuk {
    //memanggil konstruktor milik dokter
    public DokterUmum(String idDokter, String namaDokter) {
        super(idDokter, namaDokter);
    }
    //memanggil konstruktor milik dokter
    public DokterUmum(String idDokter, String namaDokter, int kuotaHarian){
            super(idDokter, namaDokter, kuotaHarian);
        }
    @Override
    public void tanganiPasien(Pasien pasien) {
        if (getSisaKuota() <= 0) {
            System.out.println("Kuota habis, " + pasien.getNama() + " diminta menunggu.");
            pasien.setStatus("menunggu");
        } else {
            periksa(pasien);
            if (pasien.getKeparahan() <= 5) {
                System.out.println("Penyakit ringan.");
                pasien.setStatus("selesai");
            } else {
                rujuk(pasien);
            }
            tambahPasienDitangani();
        }
    }


    public void periksa(Pasien pasien) {
        System.out.println(getNamaDokter() + " (umum) memeriksa " + pasien.getNama()
                + " dengan keluhan " + pasien.getPenyakit());
    }


    public void rujuk(Pasien pasien) {
        System.out.println(pasien.getNama() + " dirujuk ke dokter spesialis.");
        pasien.setStatus("dirujuk");
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis   : Dokter Umum");
    }
}
