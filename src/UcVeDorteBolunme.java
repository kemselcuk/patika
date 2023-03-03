import java.util.Scanner;
public class UcVeDorteBolunme {
    public static void main(String[] args) {
        int n;
        double sum=0,a=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı gir: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if((i%3==0)||(i%4==0)){
                a++;
                sum+=i;
            }
        }
        System.out.print("Sonuc = "+(sum/a));

    }
}

