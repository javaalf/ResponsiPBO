public abstract class Dokter {
    public static final String NAMA_RS = "Rumah Sakit Harapan indah";
    private final String idDokter;
    private String namaDokter;
    private int kuotaHarian;
    private int jumlahDitangani;

    //konstruktor 1 overloading (kuota default atau awal)
    public Dokter(String idDokter, String namaDokter) {
        this (idDokter, namaDokter, 10);
    }
    //overloading
    public Dokter(String idDokter, String namaDokter, int kuotaHarian){
        this.idDokter = idDokter;
        this.namaDokter = namaDokter;
        this.kuotaHarian = kuotaHarian;
        this.jumlahDitangani = 0;
    }
    //abstract method harus di isi oleh subclass
    public abstract void tanganiPasien(Pasien pasien);

    //panggil method void
    public void tampilkanInfo() {
        System.out.println("ID      : " + idDokter);
        System.out.println("Dokter  : " + namaDokter);
        System.out.println("Kuota   : " + jumlahDitangani + "/" + kuotaHarian);
    }
    //method fungsi
    public int getSisaKuota() {
        return kuotaHarian - jumlahDitangani;
    }
    //agar jumlah yang ditangani tetap private
    protected void tambahPasienDitangani() {
        this.jumlahDitangani++;
    }
    // Getter dan setter (idDokter hanya getter karena final)
    public String getIdDokter() { return idDokter; }

    public String getNamaDokter() { return namaDokter; }
    public void setNamaDokter(String namaDokter) { this.namaDokter = namaDokter; }

    public int getKuotaHarian() { return kuotaHarian; }
    public void setKuotaHarian(int kuotaHarian) { this.kuotaHarian = kuotaHarian; }

    public int getJumlahDitangani() { return jumlahDitangani; }
    public void setJumlahDitangani(int jumlahDitangani) { this.jumlahDitangani = jumlahDitangani; }
}

