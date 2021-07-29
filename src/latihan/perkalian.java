/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import javax.swing.JOptionPane;
/**
 *
 * @author Jilan Ariqo Nafisa
 */
public class perkalian {
 public static void main(String[] args) {
      int nilai1 = 0, nilai2 = 0, nilai3 = 0, hasil = 0;
 
      String strNilai1, strNilai2, strNilai3;
      strNilai1 = JOptionPane.showInputDialog(null, "Masukkan nilai integer pertama",
         "Perkalian Tiga Integer", JOptionPane.QUESTION_MESSAGE);
      nilai1 = Integer.parseInt(strNilai1);
 
      strNilai2 = JOptionPane.showInputDialog(null, "Masukkan nilai integer kedua",
         "Perkalian Tiga Integer", JOptionPane.QUESTION_MESSAGE);
      nilai2 = Integer.parseInt(strNilai2);
 
      strNilai3 = JOptionPane.showInputDialog(null, "Masukkan nilai integer ketiga",
         "Perkalian Tiga Integer", JOptionPane.QUESTION_MESSAGE);
      nilai3 = Integer.parseInt(strNilai3);
      hasil = nilai1 * nilai2 * nilai3;
 
      JOptionPane.showMessageDialog(null, "Nilai integer pertama : " + nilai1 +
         "\nNilai integer kedua : " + nilai2 + "\nNilai integer ketiga : " + nilai3 +
         "\nHasil perkalian tiga nilai integer : " + hasil, "Perkalian Tiga Integer",
         JOptionPane.INFORMATION_MESSAGE);
 
      System.exit(0);
   }   
}
