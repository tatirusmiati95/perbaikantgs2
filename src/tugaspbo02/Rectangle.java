package tugaspbo02;

public class Rectangle {
    double panjang;
    double lebar;

    public Rectangle() {
        panjang=5;
        lebar=2;
    }

    public Rectangle(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    void cetakInfo(){
        System.out.println("=*=*=*=*=*=*=*=*=*=");
        System.out.println("panjang :"+panjang);
        System.out.println("lebar   :"+lebar);
        System.out.println("=*=*=*=*=*=*=*=*=*=");
    }
    
    double hitungluas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah : "+hitungluas());
    }
}
