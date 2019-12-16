/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proses;

import java.util.ArrayList;
import java.util.List;
import modul_5.Modul_5;
/**
 *
 * @author Yosua
 */
public class Sort {
    private ArrayList<Integer> array;
    
    public Sort(ArrayList<Integer> arr){
        this.array = Modul_5.list;
    }
    
    public void prosesSort(){
        for(int i= 0; i < this.array.size(); i++){
             
            int index = i;
            for (int j = i + 1; j < Modul_5.list.size(); j++){  
                if (this.array.get(j) < this.array.get(index)){
                    index = j;//searching for lowest index  
                }  
            }
            
            int nilaiTerkecil = this.array.get(index);  
            this.array.set(index, this.array.get(i)); 
            this.array.set(i, nilaiTerkecil); 
        
        } 
        }
    public void view(){
        for(int i=0;i< this.array.size();i++){
            System.out.println("i = "+ this.array.get(i));
        }
    }
   
    public ArrayList<Integer> getSort(){
        return this.array;
    }
    }
