package com.crud;

abstract class Travel {
    private String namaPelanggan;
    private String alamatPelanggan;
    public int hargaBayar;
    private double jamBerangkat;
    private double jamSampai;

    public Travel(String namaPelanggan, String alamatPelanggan, int hargaBayar, double jamBerangkat, double jamSampai){
            this.namaPelanggan = namaPelanggan;
            this.alamatPelanggan = alamatPelanggan;
            this.hargaBayar = hargaBayar;
            this.jamBerangkat = jamBerangkat;
            this.jamSampai = jamSampai;
            this.tampilanUtamaTravel();
    }

    public abstract String getInfo();

    public String getNamaPelanggan() {
        return this.namaPelanggan;
    }

    public String getAlamatPelanggan(){
        return this.alamatPelanggan;
    }

    public int getHargaBayar() {
        return this.hargaBayar;
    }

    public double getJamBerangkat() {
        return this.jamBerangkat;
    }

    public double getJamSampai() {
        return this.jamSampai;
    }

    public void tampilanUtamaTravel(){
        System.out.println("==================================");
        System.out.println("\t\t\tMenu Utama\t\t\t");
        System.out.println("==================================");
    }


}
