package com.example.axiooclassprogram.tugas_kuis;

/**
 * Created by gery on 11/6/17.
 */

public class Pertanyaan {

    public int soal2[] = {
            R.string.soal1,
            R.string.soal2,
            R.string.soal3,
            R.string.soal4,
            R.string.soal5,
            R.string.soal6,
            R.string.soal7,
            R.string.soal8,
            R.string.soal9,
            R.string.soal10,
            R.string.soal11, R.string.soal12, R.string.soal13, R.string.soal14, R.string.soal15,
            R.string.soal16, R.string.soal17, R.string.soal18, R.string.soal19, R.string.soal20
    };

    private String pilihan[][] = {
            {"10", "4", "5", "8"},
            {"Rendang", "Indomie Goreng", "sate", "NasiGoreng"},
            {"popeye", "Billgates", "Larry", "Acil"},
            {"Mark Z", "Mr X", "Jajang U", "Sumanto"},
            {"Surabaya", "Amerika", "Bakasi", "Surakarta"},
            {"Anchol", "Kuta", "Ujung kulon", "Pangandaran"},
            {"Alghazali", "Afifudin", "Aliando", "Samsul"},
            {"ayam", "bebek", "burung", "Sapi"},
            {"Soeharto", "Jokowi", "SBY", "Megawati"},
            {"Piter", "James", "Mark", "Sterling"},
            {"Mars", "Bumi", "Saturnus", "Neraka"},
            {"1901", "1912", "1890", "1930"},
            {"1920", "1930", "1899", "1939"},
            {"Cikini", "Tangerang", "Jonggol", "Afrika"},
            {"Mark Z", "Bill Gates", "Sumanto", "Wiranto"},
            {"Untuk membuat Apk", "Untuk Melihat Apk", "Untuk Menjual Apk", "Untuk Bermain game"},
            {"Agar bisa di pakai", "Agar bermanfaat", "Agar Berguna", "Semua benar"},
            {"Ada Lovelace", "Sterling Human", "Crist James", "Saoline Steel"},
            {"Amien Rais", "Jokowi", "Prabowo", "Hanya Allah yang tahu"},
            {"Rendang", "Nasigoreng", "Sate", "Semua"},

    };
    private String jawabanBenar[] = {
            "8", "NasiGoreng", "Larry", "Mark Z", "Surakarta", "Kuta", "Afifudin", "burung", "Soeharto", "James",
            "Bumi", "1901", "1939", "Jonggol", "Bill Gates", "Untuk membuat Apk", "Semua benar", "Ada Lovelace", "Hanya Allah yang tahu",
            "Semua"
    };

    //    soal2
    public int getsoal2(int nomor) {
        int soall = soal2[nomor];
        return soall;
    }

    //pilihan
    public String getpilihan1(int nomor) {
        String pilihann = pilihan[nomor][0];
        return pilihann;
    }

    public String getpilihan2(int nomor) {
        String pilihann = pilihan[nomor][1];
        return pilihann;
    }

    public String getpilihan3(int nomor) {
        String pilihann = pilihan[nomor][2];
        return pilihann;
    }

    public String getpilihan4(int nomor) {
        String pilihann = pilihan[nomor][3];
        return pilihann;
    }

    //jawaban benar
    public String getjawaban(int nomor) {
        String jawaban = jawabanBenar[nomor];
        return jawaban;
    }

}
