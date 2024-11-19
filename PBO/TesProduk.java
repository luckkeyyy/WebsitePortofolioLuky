

public class TesProduk {
    public static void main(String[] args) {
        
        Produkk prdk = new Produkk();
        prdk.setNomer(1);
        prdk.setNama("Rak");
        prdk.setJumlah(50);
        prdk.setHarga(15000);
        
        Produkk ploduk = new Produkk();
        ploduk.setNomer(2);
        ploduk.setNama("Ranjang");
        ploduk.setJumlah(6);
        ploduk.setHarga(100000);
        
        Produkk p = new Produkk(2, "kursi", 10, 10000);
        Produkk l = new Produkk(5, "Lemari", 20, 40000);
        Produkk d = new Produkk(7, "Pahatan", 3, 50000);
        Produkk k = new Produkk(10, "Ukiran", 7, 60000);
        
        prdk.Deskripsi();
        System.out.println("");
        ploduk.Deskripsi();
        System.out.println("");
        p.Deskripsi();
        System.out.println("");
        l.Deskripsi();
        System.out.println("");
        d.Deskripsi();
        System.out.println("");
        k.Deskripsi();
    }
}
