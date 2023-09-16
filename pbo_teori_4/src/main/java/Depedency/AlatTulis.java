/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Depedency;

/**
 *
 * @author ahmad al fajri
 */
public class AlatTulis {

    private String Nama;
    private Listalatulis app1;
    private Listalatulis app2;
    private Listalatulis app3;

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Listalatulis getapp1() {
        return app1;

    }
    
    public Listalatulis getapp2() {
        return app2;

    }

    public void Masukform(String kegunaan, String merek) {
        app1 = new Listalatulis(kegunaan,merek);
        app2 = new Listalatulis(kegunaan,merek);
//        app2 = new Registrasi(kegunaan);

    }

    public void tampil(Listalatulis r, String Harga) {
        r.Setharga(Harga);
        System.out.println("Nama peralatan  : " +getNama());
        System.out.println("Kegunaan : " + r.getkegunaan());
        System.out.println("Merek    : " + r.getmerek());
        System.out.println("Harga    : " + r.getharga());
    }
}
