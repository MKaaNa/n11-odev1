[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/O7ZBXc2G)

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
