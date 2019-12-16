package Pengguna;
public class Pelanggan extends Manusia{
    private String nama;
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
      for(int i = getId();i<= getId();i++){
          System.out.println(i +".");
      }
        System.out.println("\tNama : "+ this.getNama());
        System.out.println("\tNo Hp : "+ this.getNohp());
  }
    
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
}
