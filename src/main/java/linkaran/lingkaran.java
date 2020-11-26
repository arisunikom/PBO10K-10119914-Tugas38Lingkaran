/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkaran;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author 
 * Aris Prabowo
 * 10119914 - IF10K
 */
public class lingkaran {
    double diameter;
    private double hitungJarijari(){
        return diameter/2;
    }
    private double hitungKeliling(){
        return Math.round(3.14*diameter);
    }
    private double hitungLuas(){
        return Math.round(3.14*hitungJarijari()*hitungJarijari());
    }
    public void checkInput(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("====Perhitungan Lingkaran====");
        boolean inputValid = false;
        while (!inputValid){
            try{
                System.out.println("Masukan nilai Diameter lingkaran: ");
                diameter = keyboard.nextDouble();
                inputValid = true;
            }catch(InputMismatchException e){
                System.out.println("Input Salah, Masukan nilai berupa angka");
                keyboard.next();
                System.out.println();
            }
        }
        System.out.println("====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-Jari Lingkaran: "+hitungJarijari()+" cm");
        System.out.println("Keliling Lingkaran: "+hitungKeliling()+" cm");
        System.out.println("Luas Lingkaran: "+hitungLuas()+" cm");
    }
}
