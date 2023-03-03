import java.util.Scanner;
public class UcakBilet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double normalTutar= 0,yasindirimliTutar=0,toplamTutar=0,mesafe;
        int gd,yas,hata = 0;
        System.out.print("Mesafeyi giriniz: ");
        mesafe = sc.nextDouble();
        System.out.print("Yasınızı giriniz:");
        yas = sc.nextInt();
        System.out.print("Tek yön ise [1]\nGidis/Dönüs ise [2]giriniz\n[.] : ");
        gd = sc.nextInt();
        if(mesafe>0){
            normalTutar = mesafe * 0.10;
        } else hata++;
        if (yas >0 ){
            if (yas<12) yasindirimliTutar = normalTutar-(normalTutar*0.5);
            else if(yas<=24) yasindirimliTutar = normalTutar-(normalTutar*0.1);
            else if(yas>65) yasindirimliTutar = normalTutar-(normalTutar*0.3);
            else yasindirimliTutar = normalTutar;
        } else hata++;
        if (gd==1 || gd==2){
            if (gd==2) toplamTutar= 2*(yasindirimliTutar-(yasindirimliTutar*0.2));
            else toplamTutar = yasindirimliTutar;
        } else hata++;
        if(hata == 0){
            System.out.print("Toplam tutar = "+toplamTutar);
        }else System.out.print("Hatalı bilgi girdiniz!!");

    }
}
