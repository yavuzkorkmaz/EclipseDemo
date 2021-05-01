package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//camelCase
		
		String isimSoyad = "Yavuz Korkmaz";
		System.out.println(isimSoyad);
		double faizOrani = 1.35;
		int yas = 70;
		boolean dolarDustuMu = true;
		
		//if else
		double dolarDun = 7.50;
		double dolarBugun = 7.50;

		
		if(dolarDun<dolarBugun) {
			
			System.out.println("Artýþ Oku");
		}
		
		else if(dolarDun>dolarBugun) {
			
			System.out.println("Azalýþ Oku");
		} 
		
		else {
			
			System.out.println();
		}
		
		
		String[] krediler = {"kredi1","kredi2","kredi3","kredi4","kredi5",};
		
		for(int a=0;a<krediler.length;a++) {
			
			System.out.println(krediler[a]);
		}
		
		
		for(String kredi : krediler) {
			
			System.out.println(kredi);
		}//foreach
		
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2= 100;
		System.out.println(sayi1);//20
		
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);//100
	
		
	
	
	
	
	
	}

}
