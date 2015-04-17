/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemPenggunaanKelasDiSTIS;

import java.util.Date;
/**
 *
 * @author user1
 */
public class Perkuliahan {
    private Kelas kelas;
    private Dosen dosen;
    private MataKuliah mataKuliah;
    private Ruangan ruangan;
    private Date waktuPerkuliahan;
    
    Kelas getKelas(){
        return kelas;
    }
    Dosen getDosen(){
        return dosen;
    }
    MataKuliah getMataKuliah(){
        return mataKuliah;
    }
    Ruangan getRuangan(){
        return ruangan;
    }
    Date getWaktuPerkuliahan(){
        return waktuPerkuliahan;
    }
    
    void setKelas(Kelas kelas){
        this.kelas = kelas;
    }
    void setDosen(Dosen dosen){
        this.dosen = dosen;
    }
    void setMataKuliah(MataKuliah mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    void setRuangan (Ruangan ruangan){
        this.ruangan = ruangan;
    }
    void setWaktuPerkuliahan(Date waktuPerkuliahan){
        this.waktuPerkuliahan = waktuPerkuliahan;
    }
}
