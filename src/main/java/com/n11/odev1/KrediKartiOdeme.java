package com.n11.odev1;

public class KrediKartiOdeme implements OdemeYontemi {

    @Override
    public OdemeSonucu ode(double tutar) {
        return OdemeSonucu.basarili(odemeMesaji(tutar));
    }

    private String odemeMesaji(double tutar) {
        return "Kredi kartı ile ödeme alındı: " + tutar + ParaBirimi.TL_SON_EK;
    }
}
