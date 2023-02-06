package gunler.gun_03.Kutuphane;

public class Kitaplar {
    String kitapAdi;
    String yazarAdi;
    int kitapId;
    static int count=100;

    Durum kitapDurumu;

    public Kitaplar(String kitapAdi, String yazarAdi) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        kitapId= count++;
        kitapDurumu=Durum.alınabilir;
    }

}
