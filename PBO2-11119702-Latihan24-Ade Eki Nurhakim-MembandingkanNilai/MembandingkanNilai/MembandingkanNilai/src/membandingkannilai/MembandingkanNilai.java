/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membandingkannilai;

/**
 *
 * @author Ekiw
 */

import java.util.Scanner;
public class MembandingkanNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       double bil1, bil2;
            System.out.print("Masukkan angka ke-1 : ");
            bil1 = scan.nextDouble();
            System.out.print("Masukkan angka ke-2 : ");
            bil2 = scan.nextDouble();
            if(bil1>bil2){
            System.out.println(bil1+" "+"Lebih Besar dari"+" "+bil2);
            }
            else if(bil2>bil1){
            System.out.println(bil2+" "+"Lebih Besar dari"+" "+bil1);
        }
    }
}