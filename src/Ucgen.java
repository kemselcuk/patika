import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgen kenar uzunluklarını giriniz: ");
        System.out.print("1.kenar: ");
        int a = input.nextInt();
        System.out.print("2.kenar: ");
        int b = input.nextInt();
        System.out.print("3.kenar: ");
        int c = input.nextInt();
        double u = (a+b+c)/2.0;
        double sonuc= u*(u-a)*(u-b)*(u-c);
        double alan = Math.sqrt(sonuc);
        System.out.println("Ucgenin alanı: "+ alan);
    }
}