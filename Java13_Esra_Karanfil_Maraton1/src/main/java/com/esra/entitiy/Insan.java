package com.esra.entitiy;

public class Insan implements IInsan{
    private String ad;
    private int yas;

    public Insan() {
    }

    public Insan(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void hastalikBulastir() {
        System.out.println(getAd()+ " hastalık bulaştırabilir.");

    }


    @Override
    public void asilamaYap() {

    }
}
