import java.util.Scanner;

public class VucutKitleEndeksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilo,boy,kitleEndeksi;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();
        kitleEndeksi = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+kitleEndeksi);
    }
}
