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
public class Listalatulis {
     private String kegunaan,merek,harga;

	public String getkegunaan() {
		return kegunaan;
	}

        public String getmerek() {
		return merek;
	}
        
         public String getharga() {
		return harga;
	}
        
         public void Setharga(String harga) {
		this.harga = harga;
	}
         
	public Listalatulis(String kegunaan, String merek) {
		this.kegunaan = kegunaan;
		this.merek = merek;
	}
}
