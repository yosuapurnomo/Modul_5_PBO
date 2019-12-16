package Pengguna;
public class Pegawai extends Manusia{
    private String nama, kataSandi;
    private int id, nopHp;
    
    @Override
    public void setNama(String nama){
      this.nama = nama;
  }
    @Override
    public String getNama(){
      return this.nama;
  }

    @Override
    public void setNohp(int no_hp){
      this.nopHp = no_hp;
  }

    @Override
    protected int getNohp(){
      return this.nopHp;
  }
    @Override
    public void print(){
      for(int i = getid();i<= getid();i++){
          System.out.println(i +".");
      }
        System.out.println("\tNama : "+ this.getNama());
        System.out.println("\tNo Hp : "+ this.getNohp());
  }
    
    public void setid(int id){
        this.id=id;
    }
    public int getid(){
        return id;
    }
    public void setKataSandi(String kataSandi){
        this.kataSandi=kataSandi;
    }
    public String getKataSandi(){
        return kataSandi;
    }
}
