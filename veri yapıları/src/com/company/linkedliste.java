package com.company;

public class linkedliste {
    node start;
    int size;

    public linkedliste() {
        this.start = null;
    }

    public void insert(node node){
        node temp = start;
        node tempnext = null;
        while(temp != null && node.tc > temp.tc){
            tempnext = temp;
            temp = temp.ileri;
        }
        
        if(tempnext == null){
            start = node;

        }else{
            tempnext.ileri = node;
        }
        node.ileri = temp;
       sırala();
        size++;
    }
node Search(long tc){
        node temp=start;
        node aranan=null;
        int i=0;
        while(temp.ileri!=null){
           // System.out.println(i);
            //i++;
            if(temp.tc==tc){
                aranan=temp;
                break;
            }
        temp=temp.ileri;
        }

        return  aranan;
}
void ekrana_yazdir(node node){

    System.out.println("tc:" +node.tc+ " adı: "+node.ad+" soyad:"+node.soyad+"  bastan: "+node.bastan+ "- sondan:"+node.sondan );
}
void sırala(){
  node temp=start;
    int tekrarsıra=0;
    int sondansira=size;
    //System.out.println(temp.bastan);
    while(temp!=null){
        temp.bastan=tekrarsıra;
        tekrarsıra++;
        temp.sondan=sondansira;
        sondansira=sondansira-1;
        temp=temp.ileri;

    }
}
    node Return_Kayit(long bastan){
        node temp=start;
        node aranan=null;
        while(temp.ileri!=null){
            if(temp.bastan==bastan){
                aranan=temp;
                break;
            }
            temp=temp.ileri;
        }
        return  aranan;
    }
    public long Delete(long index) {

        node temp=start, tempnext = null;
        //int t = index.compareTo(temp.x);
        if (temp != null && index ==temp.tc)
        {
            long k=start.tc;
            start = temp.ileri; // Changed head
            size--;
            sırala();
            return k;
        }
        while (temp != null && (index!=temp.tc))
        {
            tempnext = temp;
            temp = temp.ileri;
        }
        if (temp == null) return -1;
        long k=temp.tc;
        tempnext.ileri = temp.ileri;
        size--;
        sırala();
        return k;
    }
void yazdir(){
    node temp=start;
    while (temp!=null){
        System.out.print(temp.tc+ " bastan: "+temp.bastan+ "- sondan:"+temp.sondan+ " ) ---> (");
        temp=temp.ileri;
    }
}
int Return_Kayit_Sayisi(){
        return size;
}
}
