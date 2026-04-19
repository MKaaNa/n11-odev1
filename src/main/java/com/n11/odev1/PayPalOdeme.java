package com.n11.odev1;

public class PayPalOdeme implements OdemeYontemi {

    @Override
    public OdemeSonucu ode(double tutar) {
        return OdemeSonucu.basarili(odemeMesaji(tutar));
    }

    private String odemeMesaji(double tutar) {
        return "PayPal ile ödeme alındı: " + tutar + ParaBirimi.TL_SON_EK;
    }
}
