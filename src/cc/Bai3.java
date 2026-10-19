package cc;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cac so nguyen tren mot dong, cach nhau boi dau cach:");

        String line = scanner.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("So phan tu: 0; Tong: 0");
            return;
        }

        String[] tokens = line.split("\\s+");
        long sum = 0;
        try {
            for (String token : tokens) {
                sum += Integer.parseInt(token);
            }
        } catch (NumberFormatException exception) {
            System.out.println("Du lieu khong hop le: moi phan tu phai la mot so nguyen.");
            return;
        }

        System.out.println("So phan tu: " + tokens.length + "; Tong: " + sum);
    }
}
