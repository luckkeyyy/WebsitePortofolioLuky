

public class Produkk {
    
    private int Nomer;
    private String Nama;
    private int Jumlah;
    private int Harga;
    
    public Produkk() {
        this.Nomer = 0;
        this.Nama = "";
        this.Jumlah = 0;
        this.Harga = 0;
    }
    
    public Produkk(int Nomer, String Nama, int Jumlah, int Harga){
        this.Nomer = Nomer;
        this.Nama = Nama;
        this.Jumlah = Jumlah;
        this.Harga = Harga;
    }
    
    public int getNomer(){
        return this.Nomer;
    }
    public void setNomer(int Nomer){
        this.Nomer = Nomer;
    }
    public String getNama(){
        return this.Nama;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public int getJumlah(){
        return this.Jumlah;
    }
    public void setJumlah(int Jumlah){
        this.Jumlah = Jumlah;
    }public int getHarga(){
        return this.Harga;
    }
    public void setHarga(int Harga){
        this.Harga = Harga;
    }
    
       public void Deskripsi() {
        System.out.println("Nomor Produk  : " + Nomer);
        System.out.println("Nama Produk   : " + Nama);
        System.out.println("Jumlah Stok   : " + Jumlah);
        System.out.printf("Harga Produk   : Rp"+ Harga);
        System.out.println("");
    }
}
