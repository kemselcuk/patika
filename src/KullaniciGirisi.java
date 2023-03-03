import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String kisim,ksifre;
        int s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullici adini giriniz: ");
        kisim = sc.nextLine();
        System.out.print("Sifrenizi giriniz: ");
        ksifre = sc.nextLine();

        if((kisim.equals("patika"))&&(ksifre.equals("java123"))) System.out.println("Giris yaptiniz !");
        else if ((kisim.equals("patika"))&&!(ksifre.equals("java123"))){
            System.out.print("Sifre yanlis. Yeni bir şifre oluşturmak ister misiniz?\nİstiyorsaniz [1] \nİstemiyorsanız [2]\n ::: ");
            s = sc.nextInt();
            switch (s) {
                case 1:
                    System.out.print("yeni şifreyi girin: ");
                    ksifre = sc.nextLine();
                    break;
                case 0:
                    break;
            }
            if ((ksifre.equals("java123"))&& s == 1) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
            } else {
                    System.out.println("Sifre olusturuldu");
            }

        }
        else System.out.println("Kullanıcı adınız veya şifreniz yanlis");

    }
}
