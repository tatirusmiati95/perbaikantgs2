package tugaspbo02;

public class VolumeBalok {
    double panjang;
    double lebar;
    double tinggi;

    public VolumeBalok() {
        panjang=6;
        lebar=5;
        tinggi=5;
    }

    public VolumeBalok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    
    
    void cetakInfo(){
        System.out.println("=*=*=*=*=*=*=*=*=*=");
        System.out.println("panjang :"+panjang);
        System.out.println("lebar   :"+lebar);
        System.out.println("Tinggi  :"+tinggi);
        System.out.println("=*=*=*=*=*=*=*=*=*=");
    }
    
    double hitungvolume(){
        double volume;
        volume=panjang*lebar*tinggi;
        return volume;
    }
    
    void cetakvolume(){
        System.out.println("Hasil Isi Volume adalah :"+hitungvolume());
    }
}
