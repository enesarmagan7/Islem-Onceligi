package RockPaperScissors;

import java.util.Scanner;
public class IslemSirasiProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin (a): ");
        double a = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin (b): ");
        double b = scanner.nextDouble();

        System.out.print("Üçüncü sayıyı girin (c): ");
        double c = scanner.nextDouble();

        double sonuc = a + b * c - b;

        System.out.println("İşlem sonucu: " + sonuc);

        scanner.close();
    }
}