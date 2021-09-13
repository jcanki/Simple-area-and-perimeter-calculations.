package kalkulator;

import java.util.Scanner;

public class luas {
    public static void main(String[] args) {
        String garis = "===========================";
        String judul = " PERSEGI PANJANG ";
        int p, l, k, ls;

        // buat objek input
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("masukan panjang : ");
        p = input.nextInt();
        System.out.print("masukan lebar : ");
        l = input.nextInt();

        // rumus
        k = 2 * (p + l);
        ls = p * l;

        // output
        System.out.println(garis);
        System.out.println(judul);
        System.out.println(garis);
        System.out.println("Panjang : " + p);
        System.out.println("Lebar : " + l);
        System.out.println("Keliling : " + k);
        System.out.println("Luas : " + ls);
        System.out.println(garis);
    }
}
