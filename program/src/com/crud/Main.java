package com.crud;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int chose,c,j;
        String chs;
        String a,b,f;
        double d,e;
        j = 0;
        Kendaraan array_kendaraan[] = new Kendaraan[5];
        do {
            System.out.println("==================================");
            System.out.println("\t\t\tSelamat Datang\t\t\t");
            System.out.println("==================================");
            System.out.println("1. Lanjut");
            System.out.println("0. Finish");
            System.out.print("chose menu : ");
            chose = input.nextInt();
            switch (chose) {
                case 1:
                    do {
                        System.out.println("bandung = 65000" +
                                " jakarta = 50000" + " bogor = 50000");
                        System.out.println("Input Data ");
                        System.out.print("Nama Pelanggan => ");
                        a = input.next();
                        System.out.print("Alamat Pelanggan => ");
                        b = input.next();
                        System.out.print("Harga Bayar => ");
                        c = input.nextInt();
                        System.out.print("Jam Berangkat => ");
                        d = input.nextDouble();
                        System.out.print("Jam Tiba => ");
                        e = input.nextDouble();
                        System.out.print("Jenis Kendaraan => ");
                        f = input.next();
                        Kendaraan kdr = new Kendaraan(a, b, c, d, e, f);
                        array_kendaraan[j] = kdr;
                        j++;
                        System.out.println("Lanjut ? ");
                        chs = input.next();
                        if (chs.equalsIgnoreCase("y")) {
                            break;
                        }
                    } while(chs != "y");
                    break;
                case 2:
                    try {
                        for (int i = 0; i < array_kendaraan.length; ++i) {
                            System.out.println(array_kendaraan[i].getInfo());
                        }
                    } catch (Exception ex){
                        System.out.println(ex.getMessage());
                    }
                    break;

                default:
                    System.out.println("wrong input");
                    break;
            }
        } while (chose != 0);

    }
}

