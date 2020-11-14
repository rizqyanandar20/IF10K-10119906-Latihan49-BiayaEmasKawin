/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan49.biayaemaskawin;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BIayaKawin masKawin = new BIayaKawin();

        masKawin.setEMAS(15.7f);
        masKawin.setHarga(570000.0f);

        float EMAS = masKawin.getEMAS();
        float Harga = masKawin.getHarga();

        masKawin.TotalBayar(EMAS, Harga);
    }
}
