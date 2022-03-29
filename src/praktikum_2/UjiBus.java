/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum_2;

/**
 *
 * @author ASUS
 */
public class UjiBus {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
	Bus objek = new Bus(5);
        objek.getPassword(40);
        objek.getPassword(90);
        objek.cetak();

        objek.penumpangBaru();
        objek.Counter(50);
        objek.pluspenumpang(3);
        objek.cetak();

        objek.pluspenumpang(1);
        objek.Counter(60);
        objek.cetak();

        objek.pluspenumpang(1);
        objek.Counter(70);
        objek.cetak();
        objek.getAverage();
	}
	
}
