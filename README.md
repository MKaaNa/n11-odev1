# n11-odev1

Bu proje n11 bootcamp ödevi için hazırlandı.
Amaç, mevcut bir ödeme akışına yeni bir ödeme yöntemi eklemek ve bunu OOP/SOLID mantığıyla yapmak.

## İçerik

Projede şu sınıflar var:

- `OdemeYontemi`: ödeme stratejileri için ortak arayüz
- `KrediKartiOdeme`: mevcut ödeme yöntemi
- `PayPalOdeme`: sonradan eklenen yeni ödeme yöntemi
- `OdemeEkrani`: ödeme akışını yöneten sınıf
- `OdemeSonucu`: işlem sonucu (başarılı/başarısız + mesaj)
- `Main`: konsoldan çalışan örnek akış

## Kısa tasarım notu

Yeni bir ödeme türü eklemek için mevcut sınıfları bozmak yerine yeni bir sınıf yazmak yeterli olacak şekilde ilerledim.
Yani örneğin `ApplePayOdeme` eklemek istersem `OdemeYontemi` arayüzünü implement etmem yeterli.

## Çalıştırma

Proje kökünde şu komutu çalıştır:

```bash
mvn -q compile exec:java
```

## Not

Bu repo ödevi adım adım commit mantığıyla ilerletmek için kullanıldı.
