package gunler.gun_03.Kutuphane;

import java.util.Scanner;

public class Adminler extends İnsanlar{

    Scanner scan= new Scanner(System.in);

    public Adminler() {
    }

    public Adminler(String isim, Sıfat tip) {
        super(isim, tip);
    }

    @Override
    public void oduncKitapAl() {
        if(adminKitaplari.size()==3){
            System.out.println("Elinizdeki kitaplardan en az birini iade etmek zorundasınız");
           adminMenu();
        }
        System.out.println("Lütfen almak istedğiniz kitap idsini girin");
        Scanner scan=new Scanner(System.in);
        int kitapid= scan.nextInt();
        for (int i = 0; i < kitaplars.size(); i++) {
            if(kitaplars.get(i).kitapId==kitapid && kitaplars.get(i).kitapDurumu==Durum.alınabilir){
                adminKitaplari.add(kitaplars.get(i));
                kitaplars.get(i).kitapDurumu=Durum.alınamaz;
            }
        }
        adminMenu();
    }

    @Override
    public void alınanKitapİade() {
        System.out.println("İade kitabın Idsini yazın");
        Scanner scan= new Scanner(System.in);
        int iadeId= scan.nextInt();
        for (int i = 0; i < adminKitaplari.size(); i++) {
            if(adminKitaplari.get(i).kitapId==iadeId){
                adminKitaplari.get(i).kitapDurumu=Durum.alınabilir;
                adminKitaplari.remove(adminKitaplari.get(i));
            }
        }
        adminMenu();
    }

    @Override
    public void eldekiKitapListesi() {
        for (int i = 0; i < adminKitaplari.size(); i++) {
            System.out.println(adminKitaplari.get(i).kitapAdi + " " + adminKitaplari.get(i).kitapId);
        }
        adminMenu();
    }

    @Override
    public void kitapEkleme() {
        scan.nextLine();
        System.out.println("Kitap Adını yazın");
        String name= scan.nextLine();
        System.out.println("Yazar Adını yazın");
        String yazarınAdı= scan.nextLine();
        Kitaplar kitap1= new Kitaplar(name,yazarınAdı);
        kitaplars.add(kitap1);
        adminMenu();
    }

    @Override
    public void uyeleriListele() {
        for (int i = 0; i < personel.size(); i++) {
            if (personel.get(i).tip==Sıfat.uye){
                System.out.println(personel.get(i).isim + " " + personel.get(i).id);
            }
        }
        adminMenu();
    }

    @Override
    public void adminleriListele() {
        for (int i = 0; i < personel.size(); i++) {
            if (personel.get(i).tip==Sıfat.admin){
                System.out.println(personel.get(i).isim + " " + personel.get(i).id);
            }
        }
        adminMenu();
    }

    @Override
    public void kitaplariListele() {
        for (int i = 0; i < kitaplars.size(); i++) {
            System.out.println(kitaplars.get(i).kitapAdi + " " + kitaplars.get(i).kitapId);
        }
        adminMenu();
    }

    @Override
    public void personelEkle() {
        System.out.println("Uye eklemek için 1'e, admin eklemek için 2'ye basın");
        String uyeSecimi= scan.nextLine();
        switch (uyeSecimi){
            case "1":
                System.out.println("Isım belirtin");
                String isimYaz= scan.nextLine();
                İnsanlar insan1=new Uyeler(isimYaz, Sıfat.uye);
                personel.add(insan1);
                break;
            case "2":
                System.out.println("Admin isim belirtin");
                String adminYaz= scan.nextLine();
                İnsanlar adnin1=new Uyeler(adminYaz, Sıfat.admin);
                personel.add(adnin1);
                break;
            default:
                System.out.println("Yanliş tuşladınız");
                personelEkle();
                break;
        }
        adminMenu();
    }
    public void personelSil(){
        System.out.println("Silmek isdiğiniz personel idsini yazın");
        int idYaz=scan.nextInt();
        for (int i = 0; i < personel.size(); i++) {
            if(idYaz==personel.get(i).id){
                personel.remove(personel.get(i));
            }
        }
        adminMenu();
    }
    public void kitapSil(){
        System.out.println("Silmek isdiğiniz kitap idsini yazın");
        int idYaz=scan.nextInt();
        for (int i = 0; i < kitaplars.size(); i++) {
            if(idYaz==kitaplars.get(i).kitapId){
                kitaplars.remove(kitaplars.get(i));
            }
        }
        adminMenu();
    }
    public void personelListesi(){
        for (int i = 0; i < personel.size(); i++) {
            System.out.println(personel.get(i).isim+ " " +personel.get(i).id);
        }
       adminMenu();
    }

    public void adminMenu(){
        System.out.println("\t1 =>  Alabileceğiniz kitapları listelemek için\t\t\t 8 =>  Uyeleri listelemek için" +
                "\n\t2 =>  Tüm kitapları listelemek için\t\t\t\t\t\t 9 =>  Adminleri listelemek için" +
                "\n\t3 =>  Kütüphanemizden kitap alabilmek için\t\t\t\t10 =>  Tüm personelleri listelemek için" +
                "\n\t4 =>  Daha önce aldığınız kitabı teslim etmek için\t\t11 =>  Personel eklemek için\t\t" +
                "\n\t5 =>  Kütüphaneye kitap eklemek için\t\t\t\t\t12 =>  Personel silmek için" +
                "\n\t6 =>  Kütüphaneden kitap silmek için\t\t\t\t\t13 =>  Bir üst menüye dönmek için" +
                "\n\t7 =>  Elimdeki kitaplar\t\t\t\t\t\t\t\t\t14 =>  SİSTEMDEN ÇIKIŞ ");;
        Scanner scan= new Scanner(System.in);
        String secim= scan.nextLine();
        switch (secim){
            case "1":
                kitaplariListele();
                break;
            case "2":
                kitaplariListele();
                break;
            case "3":
                oduncKitapAl();
                break;
            case "4":
                alınanKitapİade();
                break;
            case "5":
                kitapEkleme();
                break;
            case "6":
                kitapSil();
                break;
            case "7":
                eldekiKitapListesi();
                break;
            case "8":
                uyeleriListele();
                break;
            case "9":
                adminleriListele();
                break;
            case "10":
                personelListesi();
                break;
            case "11":
                personelEkle();
                break;
            case "12":
                personelSil();
                break;
            case "13":
               anaSayfa();
                break;
            case "14":
                System.exit(0);
                break;
            default:
                System.out.println("Bu kadar method içerisinde birşey bulamadıysanız size birşey diyemiyorum");
        }
    }
}
