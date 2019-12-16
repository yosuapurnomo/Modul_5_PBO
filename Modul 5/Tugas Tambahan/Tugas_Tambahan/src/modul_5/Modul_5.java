/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_5;
import java.util.*;
import Proses.*;
/**
 *
 * @author Yosua
 */
public class Modul_5 {
    public static ArrayList<Integer> list = new ArrayList<>();
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Search search = new Search();
        int angka;
        Data check = new Data();
        do{
        System.out.println("Angka = ");
        for (int a = 0; a<Modul_5.list.size();a++){
            System.out.println(Modul_5.list.get(a));
        }
        
        
        System.out.println("1. Cari Angka");
        System.out.println("2. Input Angka");
        int pil1 =in.nextInt();
        
        switch(pil1){
            case 1:
                do{
                angka =check.getcari();
        }while(angka==0);
            System.out.println("1. Binary Search");
            System.out.println("2. Sequential Search");
            System.out.print("Pilih = ");
            int pil2 =in.nextInt();
            switch(pil2){
                case 1: 
                    search.Binary(angka);
                    break;
                case 2:
                    search.Sequntial(angka);
                    break;
                        }
            break;
            case 2:
                System.out.print("Input Angka = ");
                int nilai =in.nextInt();
                Modul_5.list.add(nilai);
                break;
    }
        }while(true);
}
    
}
