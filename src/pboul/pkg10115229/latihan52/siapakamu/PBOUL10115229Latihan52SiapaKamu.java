/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan52.siapakamu;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 */
public class PBOUL10115229Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dosen dosen1;
        
        
        dosen1 = new Dosen();
        dosen1.setNip("41227829930");
        dosen1.setNama("Rizki Adam Kurniawan");
        System.out.println("NIP DOSEN :" +dosen1.getNip());
        dosen1.siapaKamu();
        dosen1.mengajarApa();
        
        System.out.println("\n");
        
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNim("10110269");
        mahasiswa1.setNama("Nindi");
        System.out.println("NIM MAHASISWA :" +mahasiswa1.getNim());
        mahasiswa1.siapaKamu();
        mahasiswa1.kelasApa();
        
        
    }
    
}
