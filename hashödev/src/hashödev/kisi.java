package hashödev;

public class kisi {
	public String numara;
	public String ad;
	public String soyad;
	public kisi(String x,String y,String z) {
		numara=x;
		ad=y;
		soyad=z;
	}
	@Override
	public String toString() {
		return "numara= " + numara + ", ad= " + ad + ", soyad="  + soyad ;
	}


}
