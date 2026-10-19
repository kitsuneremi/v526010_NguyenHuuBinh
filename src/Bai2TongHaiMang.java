import java.util.Arrays;
import java.util.Scanner;

public class Bai2TongHaiMang {
    public static long[] sumArrays(int[] first, int[] second) {
        int length = Math.max(first.length, second.length);
        long[] sums = new long[length];

        for (int i = 0; i < length; i++) {
            long firstValue = i < first.length ? first[i] : 0;
            long secondValue = i < second.length ? second[i] : 0;
            sums[i] = firstValue + secondValue;
        }

        return sums;
    }

    private static int[] readArray(Scanner scanner, String arrayName) {
        System.out.print("Nhap so phan tu cua " + arrayName + ": ");
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("So phan tu phai la mot so nguyen.");
        }

        int length = scanner.nextInt();
        if (length < 0) {
            throw new IllegalArgumentException("So phan tu khong duoc am.");
        }

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhap " + arrayName + "[" + i + "]: ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Phan tu mang phai la mot so nguyen.");
            }
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] first = readArray(scanner, "mang thu nhat");
            int[] second = readArray(scanner, "mang thu hai");
            System.out.println("Mang tong: " + Arrays.toString(sumArrays(first, second)));
        } catch (IllegalArgumentException exception) {
            System.out.println("Du lieu khong hop le: " + exception.getMessage());
        }
    }
}
