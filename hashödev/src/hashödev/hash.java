package hashödev;

import java.util.Arrays;

class hash{
	
	double alfa;
	int size;
	kisi [] hashtable;
	float yuk;
	public hash(int boyut){
		
		hashtable= new kisi [boyut];
		
	}
	
	public void goster() {
		int i =0;
		  while(i<hashtable.length) {
			  if(hashtable[i]!=null)
			  System.out.print("\nBucket "+ (i) +": "+ hashtable[i].toString()) ;
              i++;
		  }
		  System.out.println("\ntablo boyutu :" +hashtable.length);
	          
	        
	
	}
	
	public void ekle(String numara,String ad,String soyad){
	
		 int had = (hashd(ad));
		 if((hashtable[had]) == null ) {
			 hashtable[had]=new kisi(numara,ad,soyad);
			 size++;	
			 yuk=(float) size/hashtable.length;
		 }
		 else {
			 
			 int s=1;
			 int e=2;
			 int d=had; 
			 //boþ yer aramaya baþlýyor
			 while(d<hashtable.length) {		 
				 if(hashtable[d]==null) {
					 //buldu
					 hashtable[d]=new kisi(numara,ad,soyad);
					 
					 size++;
					 yuk=(float) size/hashtable.length;
					
					break;
				 }
				 else {
					 //bulamadý hesaplamaya devam
					 d=(d+s^e)%hashtable.length;
					 s=s+1;
					 
					 
					 
				 }
			
					 }
				
			 	 
		 if(yuk>0.600) {
			 //tablo dolmaya baþladý yeni tabloya geçme vakti
				  yeni_tablo();
			 }}			 
	}
	public void yeni_tablo() {
		
		
		kisi yedekdizi[] =new kisi[hashtable.length];
		 yedekdizi=hashtable.clone();
		 hashtable = new kisi[boyutbul(hashtable.length)];
		 size =0;
		for(int k=0;k<yedekdizi.length;k++) {
			if(yedekdizi[k]!=null) {
				ekle(yedekdizi[k].numara,yedekdizi[k].ad,yedekdizi[k].soyad);
			}
		}
				
		

		}
		
	public int boyutbul(int w) {
		int s;
		int i;
		int k2;
		//sayýnýn 2 katýna en yakýn asal sayýyý döndürür;
		for( k2=w*2;w<k2;k2--) {
			s=0;
			for(int j = 2;j<k2;j++) {
				if((k2%j)==0) s = s+1;
			}
			if (s==0) break; 
		}
		System.out.println("yeni deðer :" +k2);
	
		return k2;
	}
	
	public int hashd(String x ){
			//hash deðerini bulmak için baþtan yazamadým, var olan metodu kullandým;
        	int hashVal = x.hashCode();        	
        	hashVal =hashVal% hashtable.length;
        	if (hashVal < 0)
            	hashVal=hashVal*-1;
        	
        	return hashVal;
    }
	public void sil(String x) {

		
			int deleteIndex = arama(x);
				if(deleteIndex==-1) {
					System.out.println("Böyle bir deðer yokk o yüzden silemiyorum");
				}
				else {
					hashtable[deleteIndex]=null;
					System.out.println("silenen deðer : " +x +" indis numarasý: "+ deleteIndex);
					size--;
				}

		}
		
	
	public int arama(String x) {
		
		int hashv=hashd(x);
		 int s=1;
		 int e=2;
		 int d=hashv;
		 int deger=0;
	while(true) {
		
			
		if(hashtable[d]!=null) {
			if((hashtable[d].ad).equals(x)) {
				System.out.println("\ndeðer bulundu :" + d+". indexite \nbilgiler:  "+ hashtable[d].toString());
				return d;
				
				
			
				
			}
			else {
				 d=(d+s^e)%hashtable.length;
				 s=s+1;
				 deger++;
			}
			
			
		}
		else {
			 d=(d+s^e)%hashtable.length;
			 s=s+1;
			 deger++;
			
		}
		if(deger>hashtable.length) {
			System.out.println("tabloda böyle bir deðer yok "+deger);
			return -1;
			
		}
	}
	
	
	}
}
