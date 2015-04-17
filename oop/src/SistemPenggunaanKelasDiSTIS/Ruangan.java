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
public class Ruangan {
    private String kodeGedung;
    private String kodeLantai;
    private String kodeRuangan;
    
    void setKodeGedung(String kodeGedung)throws Exception{
        int i;
        try {i = Integer.parseInt(kodeGedung);
        } catch(Exception e){
            throw new Exception ("Kode gedung harus berupa angka");
        }
        if(i>1&&i<4){
            this.kodeGedung=kodeGedung;
        }
        else{
            throw new Exception("Hanya ada gedung 2 dan 3");
        }
    }
    String getKodeGedung(){
        return kodeGedung;
    }
    void setKodeLantai(String kodeLantai)throws Exception{
        int i = Integer.parseInt(kodeGedung);
        int j ;
        try{
            j = Integer.parseInt(kodeLantai);
        } catch(Exception e){
            throw new Exception ("Kode lantai harus berupa angka");
        }
        if((i==2&&j>3&&j<=6)||(i==3&&j>1&&j<=4)){
            this.kodeLantai=kodeLantai;
        }
        else{
            throw new Exception ("Lantai yang tersedia:\ngedung 2, lantai 4 sampai 6\ngedung 3, lantai 2 sampai 4");
        }
    }
    String getsetKodeLantai(){
        return kodeLantai;
    }
    void setKodeRuangan(String kodeRuangan)throws Exception{
        int i = Integer.parseInt(kodeGedung);
        int j = Integer.parseInt(kodeLantai);
        int k ;
        try{
            k = Integer.parseInt(kodeRuangan); 
        }catch(Exception e){
            throw new Exception ("Kode ruangan harus berupa angka");
        }
        if((i==2&&j==4&&k>0&&k<=4)||
           (i==2&&j!=4&&k>0&&k<=6)||
           (i==3&&k>0&&k<=8)){
            this.kodeRuangan=kodeRuangan;
        }
        else{
            throw new Exception("Ruangan yang tersedia:\ngedung 2 lantai 4, 1 sampai 4(LAB)"+
                    "\ngedung 2 lainnya, 1 sampai 6\ngedung 3, 1 sampai 8");
        }
    }
    String getKodeRuangan(){
        return kodeRuangan;
    }
    
    Ruangan (String kodeGedung, String kodeLantai, String kodeRuangan) throws Exception {
        try{
            this.setKodeGedung(kodeGedung);
            this.setKodeLantai(kodeLantai);
            this.setKodeRuangan(kodeRuangan);
        }catch(Exception e){
            throw e;
        }
    }
}
