package gunler.gun_03.Kutuphane;

import java.util.Scanner;

public abstract class İnsanlar extends Library{

    String isim;
    int id;
    static int count;
    Sıfat tip;

    public İnsanlar() {
    }

    public İnsanlar(String isim, Sıfat tip) {
        this.isim = isim;
        this.tip = tip;
        count++;
        id=count;
    }

    public abstract void kitapEkleme ();
    public abstract void uyeleriListele ();
    public abstract void adminleriListele ();
    public abstract void kitaplariListele ();

    public abstract void personelEkle();

    public abstract void oduncKitapAl ();
    public abstract void alınanKitapİade ();

    public abstract void eldekiKitapListesi ();




    public void anaSayfa() {
        Scanner scan=new Scanner(System.in);


    }
}
