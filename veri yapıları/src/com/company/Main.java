package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        linkedliste linkedliste= new linkedliste();
       String satir;
        String[] parcaSatir=null;
        BufferedReader objReader = new BufferedReader(new FileReader("kayit_dosyasi.txt"));
        for(int i =0;i<5000;i++){
            satir = objReader.readLine();
            parcaSatir=satir.split(",");
            linkedliste.insert(new node(Long.valueOf(parcaSatir[0]),parcaSatir[1],parcaSatir[2]));
        }
        linkedliste.Delete(7756591263L);
        System.out.println(linkedliste.Return_Kayit_Sayisi());
        linkedliste.insert(new node(4532327123L,"lvxmlqtdta","rtadurkhwy"));
        System.out.println(linkedliste.Return_Kayit_Sayisi());
        linkedliste.insert(new node(23,"lvxmlqtdta","rtadurkhwy"));
        long startTime = System.nanoTime();
        node aranan=linkedliste.Search(9377761894L);
        long endTime = System.nanoTime();
        long estimatedTime = endTime - startTime;

        System.out.println((double)estimatedTime/1000000);
        linkedliste.ekrana_yazdir(aranan);
       node aranan2= linkedliste.Return_Kayit(4998);
        linkedliste.ekrana_yazdir(aranan2);
    }
}
