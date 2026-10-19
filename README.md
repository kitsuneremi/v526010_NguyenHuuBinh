# Cac bai tap mang Java

Du an gom ba chuong trinh doc lap, moi bai tap nam trong mot file Java.
Yeu cau: JDK da duoc cai dat va lenh `java`, `javac` co trong `PATH`.

## Bien dich

Mo terminal tai thu muc du an va chay:

```text
javac -encoding UTF-8 -d out src\Bai1TongMang.java src\Bai2TongHaiMang.java src\Bai3NhapMangMotDong.java
```

## Chay tung bai

```text
java -cp out Bai1TongMang
java -cp out Bai2TongHaiMang
java -cp out Bai3NhapMangMotDong
```

- `Bai1TongMang`: nhap `n`, nhap cac phan tu int va in tong.
- `Bai2TongHaiMang`: nhap hai mang va in mang tong theo vi tri. Neu mot mang
  ngan hon, cac vi tri bi thieu duoc xem la `0`; do dai ket qua bang mang dai hon.
- `Bai3NhapMangMotDong`: nhap cac so nguyen tren mot dong, cach nhau boi khoang
  trang; in so phan tu va tong. Vi du `3 4 5 33 554 67 23 6 8 5` cho ket qua
  `So phan tu: 10; Tong: 708`.

Tong va cac phan tu cua mang tong duoc tinh bang `long` de tranh tran so khi cong.
