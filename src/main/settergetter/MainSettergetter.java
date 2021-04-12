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
public class MainSettergetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        settergetter hi = new settergetter();
        hi.setNIS("03062005");
        hi.setNama("Ainu Azzaria");
        hi.setTTL("Malang, 3 Juni 2005");
        hi.setAsal("Malang");
        hi.setNoPeserta("01");
        hi.setJurusan("RPL");
        hi.setKelas("X RPL 2");
        
        settergetter hu = new settergetter();
        hu.setNIS("14112016");
        hu.setNama("Achmad Althaf Safaraz Al-Fakhr Ichsan");
        hu.setTTL("Malang, 14 November 2016");
        hu.setAsal("Malang");
        hu.setNoPeserta("02");
        hu.setJurusan("TKJ");
        hu.setKelas("X TKJ 1");
        
        String nis = hi.getNIS();
        String nama = hi.getNama();
        String ttl = hi.getTTL();
        String asal = hi.getAsal();
        String nopes = hi.getNoPeserta();
        String jurusan = hi.getJurusan();
        String kelas = hi.getKelas();
        
        String nis2 = hu.getNIS();
        String nama2 = hu.getNama();
        String ttl2 = hu.getTTL();
        String asal2 = hu.getAsal();
        String nopes2 = hu.getNoPeserta();
        String jurusan2 = hu.getJurusan();
        String kelas2 = hu.getKelas();
        
        System.out.println("DATA SISWA/I PESERTA DIDIK BARU SMK TELKOM MALANG TAHUN AJARAN 2021/2022");
        System.out.println("NIS : "+nis+" Nama : "+nama+" Tempat, Tanggal Lahir : "+ttl+" Asal : "+asal+" No. Peserta : "+nopes+" Jurusan : "+jurusan+" Kelas : "+kelas);
        System.out.println("NIS : "+nis2+" Nama : "+nama2+" Tempat, Tanggal Lahir : "+ttl2+" Asal : "+asal2+" No. Peserta : "+nopes2+" Jurusan : "+jurusan2+" Kelas : "+kelas2);
    }
    
}
