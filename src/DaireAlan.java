import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {
        int r, a;
        double cevre,alan,pi=3.14,dilim;
        Scanner input = new Scanner(System.in);
        System.out.print("r giriniz: ");
        r = input.nextInt();
        System.out.print("a giriniz");
        a = input.nextInt();
        cevre = 2*pi*r;
        alan = pi*r*r;
        dilim = (alan*a)/360;
        System.out.println("Dairenin cevresi: "+cevre);
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("a açılı daire diliminin alanı: "+dilim);
    }
}
