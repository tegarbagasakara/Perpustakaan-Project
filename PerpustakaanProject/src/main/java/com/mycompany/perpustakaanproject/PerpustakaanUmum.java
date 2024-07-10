/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaanproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kidoo
 */
// File: PerpustakaanUmum.java




public class PerpustakaanUmum implements Perpustakaan {
    private final List<String> daftarBuku = new ArrayList<>();

    @Override
    public void pinjamBuku(String judulBuku) {
        daftarBuku.remove(judulBuku);
        System.out.println("Buku \"" + judulBuku + "\" berhasil dipinjam.");
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        daftarBuku.add(judulBuku);
        System.out.println("Buku \"" + judulBuku + "\" berhasil dikembalikan.");
    }

    @Override
    public void lihatDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (String buku : daftarBuku) {
            System.out.println("- " + buku);
        }
    }

    public void tambahBuku(String judulBuku) {
        daftarBuku.add(judulBuku);
        System.out.println("Buku \"" + judulBuku + "\" berhasil ditambahkan.");
    }
}

