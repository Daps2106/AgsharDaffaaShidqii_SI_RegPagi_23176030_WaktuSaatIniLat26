/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.percobaan1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Nama     : Agshar Daffaa Shidqii
 * NIM      : 23176030
 * Prodi    : Sistem Informasi
 */
public class WaktuSaatIniLat26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Dapatkan waktu saat ini
        LocalDateTime waktuSaatIni = LocalDateTime.now();
        Locale locale = new Locale("id", "ID");

        // Format waktu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss", locale);

        // Tampilkan waktu
        System.out.println("Hari ini adalah hari : " + formatter.format(waktuSaatIni));
    }
    
}