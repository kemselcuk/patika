import java.util.Scanner;
public class TekSayiGeleneKadar {
    public static void main(String[] args) {
        int n=0,sum=0;
        Scanner sc= new Scanner(System.in);
        while (n%2==0){
            System.out.print("Yeni bir Sayı Girin: ");
            n = sc.nextInt();
            if((n%2==0)||(n/4==0)){
                sum += n;
            }
        }
        System.out.print("Toplam = "+sum);
    }
}
