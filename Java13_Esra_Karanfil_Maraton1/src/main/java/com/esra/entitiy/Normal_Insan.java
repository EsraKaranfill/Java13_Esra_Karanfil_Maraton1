package com.esra.entitiy;

public class Normal_Insan extends Insan{
    public Normal_Insan() {
    }
    public Normal_Insan(String ad, int yas) {
        super(ad, yas);
    }

    @Override
    public void hastalikBulastir() {
        super.hastalikBulastir();
    }

    @Override
    public void asilamaYap() {
        System.out.println(getAd()+ " kişisine aşılama işlemi yapılıyor.");
    }
}
