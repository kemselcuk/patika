import java.util.Scanner;
public class BasamakSayiToplami {
    public static void main(String[] args) {
        int n,b,basamak=0,sum=0,us,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        n = sc.nextInt();
        b = n;
        while(b!=0){
            b/=10;
            basamak++;
        }
        for (int i = 1; i <= basamak; i++) {
            us=1;
            for (int j = 1; j <=i  ; j++) {
                us*=10;
            }
            if (us ==10) {
                sum += n%us;
            } else {
                k = n%us;
                sum+= k/(us/10);
            }
        }
        System.out.print("Basamaklar toplamı= "+sum);
    }
}
