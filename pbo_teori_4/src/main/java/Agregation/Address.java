/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agregation;

/**
 *
 * @author ahmad al fajri
 */
   public class Address {
    private String kecamatan;
    private String kota;
    private String provinsi;
    private String alamat_lengkap;

    public String getkecamatan() {
        return kecamatan;
    }

    public String getkota() {
        return kota;
    }

    public String getprovinsi() {
        return provinsi;
    }
    
     public String getalamatlengkap() {
        return alamat_lengkap;
    }

    public Address(String provinsi, String kota, String kecamatan, String alamat_lengkap) {
        this.provinsi = provinsi;
        this.kota = kota;
        this.kecamatan = kecamatan;
        this.alamat_lengkap = alamat_lengkap;
    }

    public void printAddressDetails() {
        System.out.println("Provinsi: " + provinsi);
        System.out.println("Kota: " + kota);
        System.out.println("Kecamatan: " + kecamatan);
        System.out.println("Lebih lengkap nya di : " + alamat_lengkap);
    }

    

}



