import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        double n,r,rFac=1,nFac=1,dFac=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("n gir: ");
        n = sc.nextInt();
        System.out.print("r gir: ");
        r = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            nFac *=i ;
        }
        for (int j = 1; j <= r; j++) {
            rFac *=j;
        }
        for (int k = 1; k <= (n-r); k++) {
            dFac *=k;
        }
        double sonuc = nFac/(rFac*dFac);
        System.out.print("Sonuc="+sonuc);
    }
}
