/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemPenggunaanKelasDiSTIS;

/**
 *
 * @author user1
 */
public class MataKuliah {
    private String namaMatkul;
    private int jumlahSks;
    
    void setnamaMatkul(String namaMatkul)throws Exception{
        if(namaMatkul.length()>25){
            throw new Exception("Nama Mata Kuliah Terlalu Panjang");
        }
        this.namaMatkul = namaMatkul;
    }
    
    void setJumlahSks(int jumlahSks)throws Exception{
        if(jumlahSks>0&&jumlahSks<=4){
            this.jumlahSks = jumlahSks;
        }
        else{
            throw new Exception("Jumlah SKS yang ada hanya 1 sampai 4");
        }
    }
    
    MataKuliah(String namaMatkul, int jumlahSks)throws Exception{
        try{
            this.setnamaMatkul(namaMatkul);
            this.setJumlahSks(jumlahSks);
        } catch(Exception e){
            throw e;
        }
    }
    String getnamaMatkul(){
        return namaMatkul;
    }
    
    int getJumlahSks(){
        return jumlahSks;
    }
}
