import java.util.Scanner;
public class UsAlmaRecursive {
    static int usAlma(int num,int pow){
        if(pow == 0){
            return 1;
        }else {
            int ans = 1;
            ans *= num;
            pow--;
            return usAlma(num,pow)*ans;
        }
    }
    public static void main(String[] args) {
        int number,us;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        number = sc.nextInt();
        System.out.print("Ussunu giriniz: ");
        us = sc.nextInt();
        System.out.print("Sonuç: "+usAlma(number,us));
    }

}
