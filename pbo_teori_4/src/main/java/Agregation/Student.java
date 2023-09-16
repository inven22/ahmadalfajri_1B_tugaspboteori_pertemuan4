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
public class Student {
     String nama;
     int nim;
    Address alamat;
     MataKuliah matkul;

    /**
     * Konstruktor untuk kelas Student.
     * @param nama Nama mahasiswa.
     * @param nim NIM mahasiswa.
     * @param alamat Alamat mahasiswa.
     * @param matkul Mata Kuliah mahasiswa.
     */
    public Student(String nama, int nim, Address alamat, MataKuliah matkul) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.matkul = matkul;
    }

    /**
     * Mendapatkan nama mahasiswa.
     * @return Nama mahasiswa.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mendapatkan NIM mahasiswa.
     * @return NIM mahasiswa.
     */
    public int getNIM() {
        return nim;
    }

    /**
     * Menampilkan informasi mahasiswa.
     */
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nama\t: ").append(nama).append("\n");
        sb.append("NIM\t: ").append(nim).append("\n");
        sb.append("Alamat Anda di Provinsi ").append(alamat.getprovinsi()).append(", Kota/Kab ").append(alamat.getkota()).append(", Kecamatan ").append(alamat.getkecamatan()).append(", lebih lengkapnya di ").append(alamat.getalamatlengkap()).append("\n");
        sb.append("Mata Kuliah 1: ").append(matkul.Mk1()).append("\n");
        sb.append("Mata Kuliah 2: ").append(matkul.Mk2()).append("\n");
        sb.append("Mata Kuliah 3: ").append(matkul.Mk3()).append("\n");
        sb.append("Mata Kuliah 4: ").append(matkul.Mk4()).append("\n");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Address alamat = new Address("Jawa Barat", "Bandung", "Cicendo", "Pesona Pasteur blok C2");
        MataKuliah MK = new MataKuliah("PBO", "Basis Data", "PRPL", "Proyek");

        Student st1 = new Student("Ahmad", 221511039, alamat, MK);
        st1.print();
    }
}