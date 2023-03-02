import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        int kilo = input.nextInt();
        System.out.print("vücut kitle endeksiniz: "+(kilo/(boy*boy)));
    }
}
