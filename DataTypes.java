import  javax.swing.JOptionPane; 
import  java.util.Scanner; 

public class DataTypes{
	public static void main(String[]args){

		String  namaDepan  =  "Norvan"; 
		String  namaTengah  =  "ryan"; 
		String  namaBelakang  =  "Royansyah"; 
		
		int  usia  =  19; 
		int  targetTahunKuliah  =  4; 
		double  ipk  =  3.89764512; 
		char  nilaiAbjad  =  'A'; 
		
		Scanner inputan = new Scanner(System.in);
		
		System.out.println("======== Fase Input ========");
		System.out.println("Input nama depan : "); 
		namaDepan = inputan.nextLine();
		namaTengah =JOptionPane.showInputDialog("Nama tengah : ");
		
		System.out.println("======== Fase Output ========"); 
		System.out.println("Nama  depan  :  "+  namaDepan); 
		System.out.println("Nama  tengah  :  "+  namaTengah); 
		System.out.println("Nama  belakang:  "+  namaBelakang); 
		System.out.println("Usia  :  "  +  usia); 
		System.out.println("Target  Kuliah  :  "  +  targetTahunKuliah  +  "  tahun"); 
		System.out.println("IPK  :  "  +  ipk); 
		System.out.println("Nilai  PBO:  "+  nilaiAbjad);  
		
		JOptionPane.showMessageDialog(null,"Hai,  "+  namaDepan  +  namaTengah  +  namaBelakang); 
	}
}