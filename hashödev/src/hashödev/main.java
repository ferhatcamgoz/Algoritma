package hashödev;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class main{

	public static void main(String args[]){
	hash a = new hash(3);

	int x = 0;
	try {
		Scanner  read =new Scanner(new FileReader("kayit_dosyasi.txt"));		
		while(read.hasNext()) {
			String bilgi= read.nextLine();		
			String[] kisiler=bilgi.split(",");
			String numara=kisiler[0];
			String ad = kisiler[1];	
			String soyad = kisiler[2];
		    a.ekle(numara, ad, soyad);
			
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("dosya bulunamadý");
	}
	Scanner scan = new Scanner(System.in);

	while(true) {
		System.out.println("eleman sayýsý "+a.size);
		System.out.println("boyut "+ a.hashtable.length);
		
	System.out.println("ekleme için 1- silmek için 2- aramak için 3- çýkamak için 4 ");
	int d = scan.nextInt();
	if(d==1) {
		System.out.println("numara gir");
		String num = scan.next();
		System.out.println("ad gir");
		String ad = scan.next();
		System.out.println("soyad gir");
		String soy = scan.next();
		a.ekle(num, ad, soy);
	}
	if(d==2) {
		System.out.println("ad gir");
		String ad = scan.next();
		a.sil(ad);
	}
	if(d==3) {
		System.out.println("ad gir");
		String ad = scan.next();
		a.arama(ad);
	}
	if(d==4) {
		break;
	}
	
	}

	}

}