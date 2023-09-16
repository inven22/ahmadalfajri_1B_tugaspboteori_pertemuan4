/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheretance;

/**
 *
 * @author ahmad al fajri
 */
    public class Programmer extends IT{
	String ProgrammerStatus = "Bisa mendapat banyak cuan";
	public static void main(String[] args) {
		Programmer People = new Programmer();
		
		System.out.println(People.WorkStatus);
		System.out.println(People.ITStatus);
		System.out.println(People.ProgrammerStatus);
	}

}

