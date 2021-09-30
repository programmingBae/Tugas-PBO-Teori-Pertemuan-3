package sample;

public class Student {
    private String nama;
    private double kat;
    private double uas;
    private double uts;

    public Student(){

    }

    public Student(String nama, double kat, double uas, double uts) {
        this.nama = nama;
        this.kat = kat;
        this.uas = uas;
        this.uts = uts;
    }

    public double getNilaiRataRata(){
        double rata = (0.5 * getKat()) + (0.25 * getUts()) + (0.25 * getUas());
        return rata;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getKat() {
        return kat;
    }

    public void setKat(double kat) {
        this.kat = kat;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }
}
