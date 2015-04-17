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
public class Dosen {
    private String nama;
    private String nID;


    
    public Dosen(String nama, String nID) throws Exception{
        
        try{
        this.setNama(nama);
        this.setNID(nID);
        }
        catch(Exception e){
            throw e;
        }
    }
    
    public String getNID() {
        return nID;
    }

    public void setNID(String nID) throws Exception{
        try{
            Integer.parseInt(nID);
        } catch(Exception e){
            throw new Exception("NID harus berupa angka");
        }
                        
        this.nID = nID;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) throws Exception {
        for(char c : nama.toCharArray()){ 
            if(Character.isDigit(c)){ 
                throw new Exception("Nama tidak boleh angka");
            }
        }
        this.nama = nama;
    }
}
