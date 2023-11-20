package com.esra.entitiy;

public class Super_Insan extends Insan{
    public Super_Insan() {
    }

    public Super_Insan(String ad, int yas) {
        super(ad, yas);
    }

    @Override
    public void hastalikBulastir() {
        System.out.println(getAd()+" hastalık bulaştıramaz.");
    }

    @Override
    public void asilamaYap() {
        System.out.println(getAd()+ " kişisini aşılamaya gerek yok.");
    }
}
