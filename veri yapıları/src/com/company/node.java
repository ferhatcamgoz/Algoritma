package com.company;

public class node {
    long tc;
    node ileri;
    String ad;
    String soyad;


    int sondan;
    int bastan;

    public node(long tc) {
        this.tc = tc;
        this.ileri = null;
    }

    public node(long tc, String ad, String soyad) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
    }
/*
    @Override
    public String toString() {
        return "node{" +
                "x=" + x +
                ", ileri=" + ileri +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sondan=" + sondan +
                ", bastan=" + bastan +
                '}';
    }*/
}
