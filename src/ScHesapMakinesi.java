import java.util.Scanner;
public class ScHesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 giriniz: ");
        n1 = sc.nextInt();
        System.out.print("n2 giriniz: ");
        n2 = sc.nextInt();

        System.out.print("Islemi seciniz:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nislem: ");
        select = sc.nextInt();

        switch (select) {
            case 1 -> System.out.print("sonuc: " + n1 + n2);
            case 2 -> System.out.print("sonuc: " + (n1 - n2));
            case 3 -> System.out.print("sonuc: " + (n1 * n2));
            case 4 -> System.out.print("sonuc: " + (n1 / n2));
            default -> System.out.print("Gecersiz islem");
        }
    }
}
