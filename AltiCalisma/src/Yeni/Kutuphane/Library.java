package gunler.gun_03.Kutuphane;

import java.util.ArrayList;
import java.util.List;

public abstract class Library {
    /*
    selamlar salı günü kütüphane uygulaması yapacağız.  1-Kütüphanede admin ,üyeler ve kitaplar vardır
    2-admin kullanıcılar kütüphane sistemine sistemine kitap ekleyebilir, admin, üye ve tüm kitapları listeleyebilir,
    max 3 adet kitap emanet alabilirler.
    3-üye kişiler kitap ekleyemez ve tüm admin veya üye kişileri listeleyemez sadece müsait kitap ödünç alabilir
    kitap başka birine emanet verilmiş ise alamaz,
    emanet aldığı kitapları ve tüm müsait kitapları listeleyebilir. Önden bir çalışma yapabilirsi
     */

    static List<Kitaplar> kitaplars = new ArrayList<>();
    List<Kitaplar> adminKitaplari= new ArrayList<>();
    static List<İnsanlar> personel= new ArrayList<>();

}

