package com.crud;

class Kendaraan extends Travel {
    private String jenisKendaraan;
    public int hargaKembali;

    public Kendaraan(String namaPelanggan, String alamatPelanggan, int hargaBayar, double jamBerangkat, double jamSampai, String jenisKendaraan){
        super(namaPelanggan, alamatPelanggan,  hargaBayar,  jamBerangkat, jamSampai);
        this.jenisKendaraan = jenisKendaraan;
    }

    private int setHarga(){
        int bandung = 65000;
        int jakarta = 50000;
        int bogor = 50000;
        if (this.hargaBayar >= bandung) {
            this.hargaKembali = this.hargaBayar - bandung;
        } else if (this.hargaBayar >= jakarta) {
            this.hargaKembali = this.hargaBayar - jakarta;
        } else if (this.hargaBayar >= bogor){
            this.hargaKembali = this.hargaBayar - bogor;
        } else {
            this.hargaKembali = 0;
        }
        return this.hargaKembali;
    }

    public String getInfo() {
        if (this.setHarga() != 0) {
            System.out.println("Nama Pelanggan : " + super.getNamaPelanggan());
            System.out.println("Alamat Pelanggan : " + super.getAlamatPelanggan());
            System.out.println("Harga Pembayaran : " + super.getHargaBayar());
            System.out.println("Jam Berangkat : " + super.getJamBerangkat());
            System.out.println("Jam Sampai : " + super.getJamSampai());
            System.out.println("Jenis Kendaraan" + this.jenisKendaraan);
        } else {
            System.out.println("Nama Pelanggan : " + super.getNamaPelanggan());
            System.out.println("Alamat Pelanggan : " + super.getAlamatPelanggan());
            System.out.println("Maaf uang tidak mencukupi proses dibatalkan");
        }
        return "";
    }



}
