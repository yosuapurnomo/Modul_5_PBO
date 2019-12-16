package Transaksi;

import Pengguna.*;

public class Cucian {
   private Pegawai pegawai;
   private Pelanggan pelanggan;
   private float hargaTotal, perKilo=5000, berat;
   
   public void setPegawai(Pegawai pegawai){
       this.pegawai=pegawai;
   }
   
   public Pegawai getPegawai(){
       return this.pegawai;
   }
   
   public void setPelanggan(Pelanggan pelanggan){
       this.pelanggan=pelanggan;
   }
   
   private Pelanggan getPelanggan(){
       return pelanggan;
   }
   
   
   private float getPerkilo(){
       return this.perKilo;
   }
   
   private float getBerat(){
       return berat;
   }
   public float getHargaTOtal(float berat){
       this.berat = berat;
       return this.berat;
   }
   
   private float getHargaTotal(float berat, float perkilo){
       return this.hargaTotal=berat * perkilo;
   }
  public void print(){
      System.out.println("Nama Pegawai : "+ this.getPegawai().getNama());
      System.out.println("Nama Pelanggan : "+ this.getPelanggan().getNama());
      System.out.println("Berat Cucian : "+ this.getBerat()+ " KG. ");
      System.out.println("Harga Total Cucian : Rp."+ this.getHargaTotal(this.getHargaTOtal(berat), this.getPerkilo()));
      
  } 
}
