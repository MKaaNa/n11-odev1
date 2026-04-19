package com.n11.odev1;

public final class OdemeSonucu {

    private final boolean basarili;
    private final String mesaj;

    private OdemeSonucu(boolean basarili, String mesaj) {
        this.basarili = basarili;
        this.mesaj = mesaj;
    }

    public static OdemeSonucu basarili(String mesaj) {
        return new OdemeSonucu(true, mesaj);
    }

    public static OdemeSonucu basarisiz(String mesaj) {
        return new OdemeSonucu(false, mesaj);
    }

    public boolean isBasarili() {
        return basarili;
    }

    public String getMesaj() {
        return mesaj;
    }
}
