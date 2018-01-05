import java.lang.Math;

public class AplikasiMethod1{

	public static void Perkenalan(String nama, Integer umur){
	System.out.println("Nama Saya "+"  "+ nama + "  " + "Umur saya "+" " + umur);
	}
	
	public static void PersegiPanjang(Integer panjang,Integer tinggi){
	Integer hitung=panjang*tinggi;
    System.out.println("Maka Luasnya Adalah = "+ " "+hitung+"cm");
	}
	
	public static void Lingkaran(Double jariJari){
	Double diameter=jariJari*2;
	Double hitung2=diameter*Math.PI;
	System.out.println("Maka Keliling Lingkaranya Adalah ="+" " +hitung2+"cm");
	}
	
	public static void Persegi(Integer sisi){
	Integer hitung3=sisi*sisi;
	System.out.println("Maka Luas Persegi Adalah ="+" " +hitung3+"cm");
	}

}