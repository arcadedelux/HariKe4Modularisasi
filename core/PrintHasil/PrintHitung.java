package PrintHasil;

import HitunganMath.Hitungan;

public class PrintHitung{
	public static void Hasil(){
	Hitungan hit = new Hitungan();
	System.out.println("Jadi Luas Persegi Adalah = " +" " +hit.Persegi()+"cm");
	System.out.println("Jadi Luas Persegi Panjang Adalah ="+" "+hit.PersegiPanjang()+"cm");
	System.out.println("Jadi Keliling Lingkaran Adalah ="+" " +hit.Lingkaran()+"cm");
	}
}