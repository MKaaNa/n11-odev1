package com.n11.odev1;

import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        OdemeEkrani ekran = new OdemeEkrani();

        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.forLanguageTag("tr-TR"));

            System.out.println("=== Ödeme ===");
            OdemeTipi.menuyuYazdir();
            System.out.print("Seçiminiz: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Geçersiz seçim. Sayı giriniz.");
                return;
            }
            int secim = scanner.nextInt();

            System.out.print("Tutar (TL): ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Geçersiz tutar.");
                return;
            }
            double tutar = scanner.nextDouble();

            Optional<OdemeTipi> odemeTipi = OdemeTipi.konsolKodundanBul(secim);
            if (odemeTipi.isEmpty()) {
                System.out.println("Geçersiz seçim.");
                return;
            }

            OdemeYontemi yontem = odemeTipi.get().yontemOlustur();
            OdemeSonucu sonuc = ekran.odemeYap(yontem, tutar);
            sonucuYazdir(sonuc);
        }
    }

    private static void sonucuYazdir(OdemeSonucu sonuc) {
        System.out.println(sonuc.getMesaj());
        if (sonuc.isBasarili()) {
            System.out.println("İşlem tamam.");
        } else {
            System.out.println("İşlem yapılamadı.");
        }
    }
}
