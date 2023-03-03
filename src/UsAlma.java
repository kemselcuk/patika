import java.util.Scanner;
public class UsAlma {
    public static void main(String[] args) {
        int num,force,ans=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        num = sc.nextInt();
        System.out.print("Kuvveti girin: ");
        force = sc.nextInt();
        for (int i = 1; i <=force  ; i++) {
            ans*=num;
        }
        System.out.print("Cevap = "+ans);
    }
}
