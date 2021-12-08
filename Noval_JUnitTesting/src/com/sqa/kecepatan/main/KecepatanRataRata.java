package com.sqa.kecepatan.main;

import java.util.Scanner;

public class KecepatanRataRata{
	public static void main (String []args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("Masukan Jarak Tempuh Anda(km) :");
			double jarak = sc.nextInt();
			System.out.print("Masukan Waktu Tempuh Anda(Jam) :");
			double waktu = sc.nextInt();
			
			double kecepatanRataRata = KecepatanRataRata(jarak, waktu);
			System.out.println("Kecepatan Rata Rata Anda Adalah = " + kecepatanRataRata+" km/H");
			}

	public static double KecepatanRataRata(double jarak, double waktu) {
		// TODO Auto-generated method stub
		double result = jarak/waktu;
		return result;
	}


}
