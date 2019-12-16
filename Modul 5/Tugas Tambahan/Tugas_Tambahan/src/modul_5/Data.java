/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_5;
import java.util.*;
/**
 *
 * @author Yosua
 */
public class Data {
    private int cari;
    
//    public void setCari(String cari){
//        this.cari = cari;
//}
    public int getcari(){
        Scanner in = new Scanner(System.in);
        System.out.print("Angka yang dicari = ");
         try{
         this.cari = in.nextInt();
         }catch(Exception e){
             System.out.println("Inputan Salah");
             this.cari = 0;
         }
        return this.cari;
    }
}
