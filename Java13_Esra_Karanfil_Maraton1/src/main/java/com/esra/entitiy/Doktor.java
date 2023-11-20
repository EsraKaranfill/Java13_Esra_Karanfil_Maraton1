package com.esra.entitiy;

public class Doktor extends Insan{
    public Doktor() {
    }

    public Doktor(String ad, int yas) {
        super(ad, yas);
    }

    @Override
    public void hastalikBulastir() {
        super.hastalikBulastir();
    }

    @Override
    public void asilamaYap() {
        System.out.println(getAd()+" aşılama yapıyor");
    }
}
