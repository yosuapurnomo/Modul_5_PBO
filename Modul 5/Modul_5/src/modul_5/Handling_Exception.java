/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_5;
import java.util.*;
import static modul_5.Modul_5.list;
/**
 *
 * @author Yosua
 */
public class Handling_Exception extends Exception{
    private int cari;
    
//    public void setCari(String cari){
//        this.cari = cari;
//}
    public int setPencarian(){
        Scanner in = new Scanner(System.in);
        System.out.println("Angka = ");
        for (int a = 0; a<list.size();a++){
            System.out.println(list.get(a));
        }
        System.out.print("Angka yang dicari = ");
        try{
            this.cari = in.nextInt();
        }catch(Exception e){
            System.out.println("Inputan bukan angka");
            return setPencarian();
        }
        return cari;
    }
}
