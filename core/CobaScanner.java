import java.lang.Math;
import java.util.Scanner;
	public class CobaScanner{
	public static void HitungPersegi(){

	Scanner tes = new Scanner(System.in);
	System.out.print("Masukan Sisinya : ");
	
	Integer sisi =tes.nextInt();
	Integer hitung=sisi*sisi;
		
	System.out.println("Maka Luas Perseginya Adalah= "+hitung+"cm");
	}
	
	public static void HitungPersegiPanjang(){
	
	Scanner tes1 = new Scanner(System.in);
	System.out.print("Masukan Lebarnya = ");	 
    Integer lebar=tes1.nextInt();
		 
	Scanner tes2 = new Scanner(System.in);
	System.out.print("Masukan Panjang: ");
	Integer panjang =tes2.nextInt(); 
		 
	Integer hitung1 =panjang*lebar;
	System.out.println("Maka Luas Persegi Panjangnya Adalah = "+hitung1+"cm");
	 }
	
	public static void HitungLing(){
		
	Scanner ling1 = new Scanner(System.in);
	System.out.print("Masukan Jari-Jarinya Lingkaranya = ");
	Double jar=ling1.nextDouble();
	Double hitung2 =jar*2;
	Double hitung3 = hitung2 * Math.PI;
	System.out.println("Maka Keliling Lingkarannya Adalah = "+hitung3+"cm");
	}
	
	public static void main(String[] args){

		
	Scanner tes = new Scanner(System.in);
	System.out.print("Pilihan: ");
	String baru = tes.nextLine();
	
	
	if(baru.equals ("persegi")){
	HitungPersegi();
	}else if(baru.equals("persegipanjang")){
	HitungPersegiPanjang();
	}else if(baru.equals ("lingkaran")){
	HitungLing();	
	}else{
		System.out.println("Masukan Salah");
	}
}
	}