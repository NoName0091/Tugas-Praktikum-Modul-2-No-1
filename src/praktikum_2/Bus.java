/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bus {
Scanner input = new Scanner(System.in);
    private double penumpang, maxpenumpang;

    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }

    public void pluspenumpang(double penumpang){
        double temp;
        penumpangBaru();
        Counter(50);
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }

    }
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("pass salah");
        }

    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang yang seharusnya adalah ="+maxpenumpang);
    }

    public void Counter(double counter){
        System.out.println("Berat penumpang adalah: "+counter);
    }

    public void penumpangBaru(){
        System.out.println("Penambahan penumpang adalah = ");
        double penumbangbaru = input.nextDouble();
        System.out.println("Jumlah penumpang sekarang adalah = "+(penumpang + penumbangbaru));
    }

    public void getAverage(){
        System.out.println("Rata rata berat penumpang adalah 60KG");	
    }
}
