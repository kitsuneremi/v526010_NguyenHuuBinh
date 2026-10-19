package cc;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu n: ");
        if (!scanner.hasNextInt()) {
            System.out.println("n phai la mot so nguyen.");
            return;
        }

        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("n phai lon hon 0.");
            return;
        }

        int[] numbers = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            if (!scanner.hasNextInt()) {
                System.out.println("Phan tu phai la mot so nguyen.");
                return;
            }
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println("Tong cac phan tu: " + sum);
    }
}
