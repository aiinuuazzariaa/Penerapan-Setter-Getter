/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.settergetter;

/**
 *
 * @author MOKLET-2
 */
    public class settergetter {
    private String nis;
    private String nama;
    private String ttl;
    private String asal;
    private String nopes;
    protected String jurusan;
    protected String kelas;
    
    public void setNIS(String nis){
    this.nis = nis;
    }
    
    public String getNIS(){
        return nis;
    }
    
    public void setNama(String nama){
    this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setTTL(String ttl){
    this.ttl = ttl;
    }
    
    public String getTTL(){
        return ttl;
    }
    
    public void setAsal(String asal){
    this.asal = asal;
    }
    
    public String getAsal(){
        return asal;
    }
    
    public void setNoPeserta(String nopes){
    this.nopes = nopes;
    }
    
    public String getNoPeserta(){
        return nopes;
    }
    
    public void setJurusan(String jurusan){
    this.jurusan = jurusan;
    }
    
    public String getJurusan(){
        return jurusan;
    }
    
    public void setKelas(String kelas){
    this.kelas = kelas;
    }
    
    public String getKelas(){
        return kelas;
    }
}

