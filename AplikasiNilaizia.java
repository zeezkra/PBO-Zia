/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplikasinilai;

/**
 *
 * @author IMPERIAL
 */
import java.util.Scanner;

public class AplikasiNilaizia {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiETS = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiEAS = scanner.nextDouble();

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.35 * nilaiETS) + (0.45 * nilaiEAS);

        System.out.println("Nilai Akhir: " + nilaiAkhir);

        String grade;
        if (nilaiAkhir > 85) {
            grade = "A";
        } else if (nilaiAkhir >= 75) {
            grade = "B";
        } else if (nilaiAkhir >= 65) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Termasuk ke dalam bagian kelas nilai: " + grade);
        
    }
}
