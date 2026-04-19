package com.n11.odev1;

import java.util.Optional;

public enum OdemeTipi {

    KREDI_KARTI(1, "Kredi kartı"),
    PAYPAL(2, "PayPal");

    private final int konsolKodu;
    private final String etiket;

    OdemeTipi(int konsolKodu, String etiket) {
        this.konsolKodu = konsolKodu;
        this.etiket = etiket;
    }

    public static Optional<OdemeTipi> konsolKodundanBul(int kod) {
        for (OdemeTipi tip : values()) {
            if (tip.konsolKodu == kod) {
                return Optional.of(tip);
            }
        }
        return Optional.empty();
    }

    public OdemeYontemi yontemOlustur() {
        return switch (this) {
            case KREDI_KARTI -> new KrediKartiOdeme();
            case PAYPAL -> new PayPalOdeme();
        };
    }

    public static void menuyuYazdir() {
        for (OdemeTipi tip : values()) {
            System.out.println(tip.konsolKodu + " - " + tip.etiket);
        }
    }
}
