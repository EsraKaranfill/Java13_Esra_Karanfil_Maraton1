package com.esra;

import com.esra.entitiy.*;
import com.esra.service.AsilananInsanlar;
import com.esra.service.Saglik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen isminizi girin: ");
        String isim = scanner.nextLine();

        System.out.print("Lütfen yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.println("Lütfen aşılama yapılacak insan türünü seçin:");
        System.out.println("1. Normal İnsan");
        System.out.println("2. Doktor");
        System.out.println("3. Süper İnsan");

        int secim = scanner.nextInt();

        Insan insan;
        switch (secim) {
            case 1:
                insan = new Normal_Insan(isim, yas);
                hastalikDurumu();
                break;
            case 2:
                insan = new Doktor(isim, yas);
                insan.asilamaYap();
                SaglikDurumu.ASILI.ordinal();
                break;
            case 3:
                insan = new Super_Insan(isim, yas);
                insan.asilamaYap();
                SaglikDurumu.SAGLIKLI.ordinal();
                break;
            default:
                System.out.println("Geçersiz seçim. Varsayılan olarak Normal İnsan olarak devam edilecek.");
                insan = new Normal_Insan(isim, yas);
        }
        AsilananInsanlar asilananlar=new AsilananInsanlar();
        insan.hastalikBulastir();
        asilananlar.asilamaYap(insan);
        asilananlar.raporVer();



    }

    public static void hastalikDurumu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen hastalık durumunu seçin:");
        System.out.println("1. Hasta");
        System.out.println("2. Sağlıklı");
        int sagliksecim = scanner.nextInt();

        switch (sagliksecim) {
            case 1:
                sagliksecim =SaglikDurumu.HASTA.ordinal();
                System.out.println(SaglikDurumu.HASTA);
                break;
            case 2:
                sagliksecim = SaglikDurumu.SAGLIKLI.ordinal();
                System.out.println(SaglikDurumu.SAGLIKLI);
                break;
            default:
                System.out.println("Geçersiz seçim. Varsayılan olarak Sağlıklı olarak devam edilecek.");
                sagliksecim = SaglikDurumu.SAGLIKLI.ordinal();
                System.out.println(SaglikDurumu.SAGLIKLI);
        }
    }
}