/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proses;
import modul_5.Modul_5;

/**
 *
 * @author Yosua
 */
public class Search extends Abstract{
    
    @Override
    public void Binary(int cari){
        int n = Modul_5.list.size();
        int atas = 0;
        int bawah = n-1;
        boolean ketemu = false;
        
        while((atas <= bawah)&&(ketemu == false)){
        int tes = (atas+bawah)/2;
            if(Modul_5.list.get(tes)==cari){
                ketemu = true;
            }
            else if(Modul_5.list.get(tes)<=cari){
                atas = tes+1;
            }
            else{
                bawah = tes - 1;
            }
    }
        if (ketemu){
            System.out.println("Data ditemukan ");
        }
        else{
            System.out.println("Data tidak ada");
        }
        
    }
    @Override
    public void Sequntial(int cari){
        for(int a=0;a<Modul_5.list.size();a++){
            if (cari == Modul_5.list.get(a)){
                System.out.println("Data ditemukan "+ Modul_5.list.get(a));
            }
        }
    }
        
}
