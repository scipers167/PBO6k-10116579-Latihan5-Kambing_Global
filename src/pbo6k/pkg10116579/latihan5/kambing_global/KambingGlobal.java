/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116579.latihan5.kambing_global;

/**
 *
 */
 
public class KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
    //Variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getjumlahKambing(){
        System.out.println("jumlah kambing: " + jumlahKambing);

    }
    
    public void tambahKambing() {
       
      jumlahKambing = jumlahKambing + 5;
       System.out.println("Jumlah Kambing setelah ditambah:" +
               jumlahKambing);
   }
    public static void main(String[] args) {
       
        
        
        KambingGlobal kambingSusu = new KambingGlobal();
        
        
        //Menampilkan jumlah Kambing yang ada saat program x berjalan
        kambingSusu.getjumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getjumlahKambing();
    }

   
        }
   
    

