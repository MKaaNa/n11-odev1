package com.n11.odev1;

public class OdemeEkrani {

    public OdemeSonucu odemeYap(OdemeYontemi yontem, double tutar) {
        if (tutar <= 0) {
            return OdemeSonucu.basarisiz("Tutar sıfırdan büyük olmalı.");
        }
        if (yontem == null) {
            return OdemeSonucu.basarisiz("Ödeme yöntemi seçilmedi.");
        }
        return yontem.ode(tutar);
    }
}
