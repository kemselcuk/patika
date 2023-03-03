import java.util.Scanner;
public class SinifiGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,d,toplam;
        toplam = 0;
        d=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = sc.nextInt();
        if((mat >= 0) && (mat<=100) ){
            toplam+=mat;
            d++;
        }
        System.out.print("Fizik notunuz: ");
        fizik = sc.nextInt();
        if((fizik>=0) && (fizik<=100)){
            toplam+=fizik;
            d++;
        }
        System.out.print("Turkce notunuz: ");
        turkce = sc.nextInt();
        if((turkce>=0)  && (turkce <= 100)){
            toplam+=turkce;
            d++;
        }
        System.out.print("Kimya notunuz: ");
        kimya = sc.nextInt();
        if((kimya>=0)  && (kimya <= 100)){
            toplam+=kimya;
            d++;
        }
        System.out.print("Muzik notunuz: ");
        muzik = sc.nextInt();
        if((muzik>=0)  && (muzik <= 100)){
            toplam+=muzik;
            d++;
        }
        String sonuc = (toplam/5)>=d ? "Geçtiniz":"Kaldınız";
        System.out.println(sonuc);
    }
}
