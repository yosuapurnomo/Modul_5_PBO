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
    public static List<Integer> list = new LinkedList<>();
   
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Search search = new Search();
        list.add(1);
        list.add(2);
        list.add(3);
        int angka;
        Handling_Exception check = new Handling_Exception();
        angka = check.setPencarian();
        System.out.println("1. Binary Search");
        System.out.println("2. Sequential Search");
        System.out.print("Pilih = ");
        int pil =in.nextInt();
        
        switch(pil){
            case 1: 
                search.Binary(angka);
                break;
            case 2:
                search.Sequntial(angka);
                break;
                    }
       
        
    }
    
}
