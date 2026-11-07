public class Pasien {
    private String nama;
    private String penyakit;
    private String status;
    private int keparahan;

//kontruktor 1 overloading
public Pasien (String nama, String penyakit) {
    this (nama, penyakit,3);
}

//konstruktor 2 overloading
public Pasien (String nama, String penyakit, int keparahan){
    this.nama =  nama;
    this.penyakit = penyakit;
    this.keparahan =  keparahan;
    this.status = "menunggu";
}

//getter setter
public String getNama() { return nama; }
public void setNama(String nama) { this.nama = nama; }

public String getPenyakit() { return penyakit; }
public void setPenyakit(String penyakit) { this.penyakit = penyakit; }

public int getKeparahan() { return keparahan; }
public void setKeparahan(int keparahan) { this.keparahan = keparahan; }

public String getStatus() { return status; }
public void setStatus(String status) { this.status = status; }
}

