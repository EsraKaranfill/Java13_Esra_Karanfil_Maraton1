package com.esra.service;

import com.esra.entitiy.IInsan;
import com.esra.entitiy.Insan;
import com.esra.entitiy.Normal_Insan;
import com.esra.entitiy.SaglikDurumu;

public class Saglik implements IInsan {
    private SaglikDurumu durum;
    public Saglik(SaglikDurumu durum){
        this.durum=durum;
    }
    @Override
    public void hastalikBulastir() {

    }

    @Override
    public void asilamaYap() {
        System.out.println("Sağlık durumu: " +durum);
    }


}
