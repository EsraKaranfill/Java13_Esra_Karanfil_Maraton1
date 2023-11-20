package com.esra.service;

import com.esra.entitiy.Doktor;
import com.esra.entitiy.Insan;
import com.esra.entitiy.Super_Insan;

public class AsilananInsanlar {
    private Insan[] insanlar=new Insan[1000];
    private int mevcutIndex;
    Doktor doktor=new Doktor();
    Super_Insan superInsan=new Super_Insan();
    public void asilamaYap(Insan insan){
        if (!(insan instanceof Doktor) && !(insan instanceof Super_Insan)) {
            if (mevcutIndex < insanlar.length) {
                insan.asilamaYap();
                insanlar[mevcutIndex++] = insan;
            } else {
                System.out.println("Aşı kapasitesi dolu. Daha fazla aşı yapılamaz.");
            }
        } else {
            System.out.println("Doktor veya Süper İnsanlar aşılamaya eklenmiyor.");
        }
    }

    public void raporVer(){
        System.out.println("Aşılanan insanlar: ");
        for (int i=0;i<mevcutIndex;i++){
            System.out.println(insanlar[i].getAd()+" "+insanlar[i].getYas()+" yaşında");
        }
    }
}
