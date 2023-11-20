package Overload;

import java.time.LocalDate;
import java.util.logging.Logger;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Overload {

    public void write(String redink) {
        System.out.println(redink);

    }

    public void write() {
        System.err.println();
    }
////////////////////////////////////////////////////////////////////////////////

    public static void hitungumur(int tahunSekarang, int TahunLahir) {
        int Hasil = tahunSekarang - TahunLahir;

        System.out.println("Sekarang anda umur :" + Hasil);
    }

    public void animasi(int start, int end) {
        if (start > end) {
            for (int i = start; i > end; i--) {
                System.out.print("\r" + " ".repeat(i) + "🚗");
                try {

                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            for (int i = start; i < end; i++) {
                System.out.print("\r" + " ".repeat(i) + "🚗");
                try {

                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void animasi() {
        System.err.println("parameter tidak boleh kosong");
    }

////////////////////////////////////////////////////////////////////////////////
    public void RunProgram(String Program) {

        try {
            FileWriter fw = new FileWriter("Start.bat");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("@ocho off \n");
            bw.write("start " + Program + ".exe");

            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Runtime.getRuntime().exec("Start.bat");
        } catch (IOException e) {
        }

    }

    public void RunProgram() {
        System.err.println("isi nama program pada parameter");
    }
////////////////////////////////////////////////////////////////////////////////

    public void Bulan() {
        LocalDate c = LocalDate.now();
        System.out.println("Bulan :" + c.getMonth());

    }

////////////////////////////////////////////////////////////////////////////////
    public int Tahun() {
        LocalDate v = LocalDate.now();

        int tahun = v.getYear();
        int tahun1 = tahun;

        return tahun1;
    }
////////////////////////////////////////////////////////////////////////////////

    public void toRed(String keterangan) {

        System.err.println(keterangan);
    }
////////////////////////////////////////////////////////////////////////////////

    public int jamKeDetik(int WaktuJam) {

        return 3600 * WaktuJam;
    }
////////////////////////////////////////////////////////////////////////////////

    public static void createProgramtoShutdown() {
        try {
            FileWriter fw = new FileWriter("winword.bat");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("@echo off \n");

            for (int i = 0; i < 10; i++) {
                bw.write("start notepad.exe \n");

            }

            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
////////////////////////////////////////////////////////////////////////////////

    public void Winword() {

        try {
            FileWriter fw = new FileWriter("winword.bat");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("@echo off \n start winword.exe");
            bw.close();
            fw.close();

            Runtime.getRuntime().exec("winword.bat");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
////////////////////////////////////////////////////////////////////////////////
}
