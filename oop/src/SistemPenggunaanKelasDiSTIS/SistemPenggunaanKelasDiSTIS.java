/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemPenggunaanKelasDiSTIS;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user1
 */
public class SistemPenggunaanKelasDiSTIS {
    public static void main (String[]args){
        
        Dosen dosen1=null;
        try{
             dosen1 = new Dosen("Bambang Dwi Putra Nugraha","137530");
        }catch(Exception ex) {
            Logger.getLogger(SistemPenggunaanKelasDiSTIS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         MataKuliah mataKuliah1=null;
        try{
            mataKuliah1 = new MataKuliah("Kalkulus 2", 3);
        }catch(Exception ex) {
            Logger.getLogger(SistemPenggunaanKelasDiSTIS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Ruangan ruangan1=null;
        try{
             ruangan1 = new Ruangan("2","6","6");
        }catch(Exception ex) {
            Logger.getLogger(SistemPenggunaanKelasDiSTIS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Kelas kelas1=null;
        try{
            kelas1 = new Kelas("2", "KS2");
        }catch(Exception ex){
            Logger.getLogger(SistemPenggunaanKelasDiSTIS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Perkuliahan perkuliahan1 = new Perkuliahan();
        perkuliahan1.setDosen(dosen1);
        perkuliahan1.setKelas(kelas1);
        perkuliahan1.setMataKuliah(mataKuliah1);
        perkuliahan1.setRuangan(ruangan1);
        perkuliahan1.setWaktuPerkuliahan(new Date());
        
        PrintPerkuliahan(perkuliahan1);
        
    }
    public static void PrintPerkuliahan(Perkuliahan perkuliahan){
        System.out.println("Nama Dosen\t: "+perkuliahan.getDosen().getNama());
        System.out.println("Mata Kuliah\t: "+perkuliahan.getMataKuliah().getnamaMatkul());
        System.out.println("Kelas\t\t: "+perkuliahan.getKelas().getTingkat()+perkuliahan.getKelas().getKodeKelas());
        System.out.println("Ruang\t\t: "+perkuliahan.getRuangan().getKodeGedung()+
                perkuliahan.getRuangan().getKodeRuangan()+perkuliahan.getRuangan().getsetKodeLantai());
        System.out.println("Waktu\t\t :"+perkuliahan.getWaktuPerkuliahan());
    }
}
