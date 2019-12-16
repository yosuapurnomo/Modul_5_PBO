package Main;
import Transaksi.Cucian;
import Pengguna.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Npm06979Pendahuluan {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Pegawai> pegawaiArr=new ArrayList<>();
    static ArrayList<Pelanggan> pelangganArr=new ArrayList<>();
    static ArrayList<Cucian> cucianArr=new ArrayList<>();
    public static void main(String[] args) {
        int menu;
        do {
            Npm06979Pendahuluan main;
            main = new Npm06979Pendahuluan();
            System.out.println("\n\nSistem Informasi Laundry RPL!!!");
            main.tampilkanData();
            System.out.println("\n\nMenu");
            System.out.println("1. Tambah Kasir");
            System.out.println("2. Tambah Pelanggan");
            System.out.println("3. Tambah Transaksi");
            System.out.println("0. Selesai");
            System.out.print("Masukkan Nomor Menu : ");
            menu = scan.nextInt();
            switch (menu){
                case 1 :
                    main.tambahKasir();
                    break;
                case 2:
                    main.tambahPelanggan();
                    break;
                case 3 :
                    main.tambahCucian();
                    break;
                default :
                    menu = 0;
                    System.out.println("Terimakasih telah menggunakan sistem informasi laundry RPL!!!");
            }
        }
        while(menu != 0);
    }
    static void tampilkanData(){
        System.out.println("\n\nData Pegawai");
        for(int i=0;i<pegawaiArr.size();i++){
            pegawaiArr.get(i).print();
        }
        System.out.println("\n\nData Pelanggan : ");
        for(int i=0;i<pelangganArr.size();i++){
            pelangganArr.get(i).print();
        }
        System.out.println("\n\nData Cucian : ");
        for(int i=0;i<cucianArr.size();i++){
            cucianArr.get(i).print();
        }
    }
    static void tambahKasir(){
        System.out.println("Tamba Data Pegawai !!!");
        Pegawai pegawai =new Pegawai();
        System.out.println("ID Pegawai : "+String.valueOf(pegawaiArr.size()+1));
        pegawai.setid(pegawaiArr.size()+1);
        System.out.print("Nama Pegawai : ");
        pegawai.setNama(scan.next());
        System.out.print("Kata sandi Pegawai : ");
        pegawai.setKataSandi(scan.next());
        System.out.print("Nomor HP Pegawai : ");
        pegawai.setNohp(scan.nextInt());
        pegawaiArr.add(pegawai);
}
static void tambahPelanggan(){
    System.out.println("Tambah Pelanggan !!!");
    Pelanggan pelanggan = new Pelanggan();
    System.out.println("ID Pelanggan : "+String.valueOf(pelangganArr.size()+1));
    pelanggan.setId(pelangganArr.size()+1);
    System.out.println("Nama Pelanggan : ");
    pelanggan.setNama(scan.next());
    System.out.println("Nomor HP Pelanggan : ");
    pelanggan.setNohp(scan.nextInt());
    
    pelangganArr.add(pelanggan);
    
}
static void tambahCucian(){
    System.out.println("Tambah Data Cucian!");
    Cucian cucian = new Cucian();
    System.out.print("ID Pegawai : ");
    cucian.setPegawai(pegawaiArr.get(scan.nextInt()-1));
    System.out.print("ID Pelanggan : ");
    cucian.setPelanggan(pelangganArr.get(scan.nextInt()-1));
    System.out.println("Berat Cucian (KG.) : ");
    cucian.getHargaTOtal(scan.nextFloat());
    cucianArr.add(cucian);
}
}
