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
public class Kelas {
    private String tingkat;
    private String kodeKelas;
    
    void setTingkat(String tingkat)throws Exception{
        int i;
        try{
            i = Integer.parseInt(tingkat);
        }catch(Exception e){
            throw new Exception("Tingkat harus berupa anggka");
        }
        if (i>0&&i<=4){
            this.tingkat = tingkat;
        }
        else{
            throw new Exception("Hanya ada tingkat 1 sampai 4");
        }
    }
    String getTingkat(){
        return tingkat;
    }
    void setKodeKelas (String kodeKelas){
        this.kodeKelas = kodeKelas;
    }
    String getKodeKelas(){
        return kodeKelas;
    }
    Kelas(String tingkat, String kodeKelas)throws Exception{
        this.setKodeKelas(kodeKelas);
        try{
            this.setTingkat(tingkat);    
        }catch (Exception e){
            throw e;
        }
    }
}
