public class myclass {
    public static void main(String args[]) {
     int [] dizi={1,2,3,4,5,6,7,8,9,10};
     
     terscevir(dizi,0);
     print(dizi,0);
    }
    
    public static void print(int[] dizi,int a)
    {
        if (a<dizi.length)
        {
            System.out.print(dizi[a]+" ");
            a++;
            print(dizi,a);
        }
    }
     public static void terscevir(int [] dizi,int basla)
    {
        if (basla>=dizi.length/2)
        {
            return;
        }
        int temp=dizi[basla];
        dizi[basla]=dizi[dizi.length-1-basla];
        dizi[dizi.length-1-basla]=temp;
        terscevir(dizi,++basla);
    
        
        
    }
 
}