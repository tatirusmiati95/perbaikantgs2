package tugaspbo02;

public class VolumeBalokAksi {
    public static void main(String[] args) {
        VolumeBalok n1 = new VolumeBalok();
        n1.panjang = 4;
        n1.lebar = 8;
        n1.tinggi = 7;
        
        n1.cetakInfo();
        System.out.println("Isi Volume :"+n1.hitungvolume());
        n1.cetakvolume();
        
        VolumeBalok n2 = new VolumeBalok();
        n2.cetakInfo();
        
        VolumeBalok n3 = new VolumeBalok(10,8,14);
        n3.cetakInfo();
    }
}
