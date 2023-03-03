import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("1.Sayiyi giriniz: ");
        x = sc.nextInt();
        System.out.print("2.Sayiyi giriniz: ");
        y = sc.nextInt();
        System.out.print("3.Sayiyi giriniz: ");
        z = sc.nextInt();

        if((x>y)&&(x>z)){
            if (y>z) System.out.print("x>y>z");
            else System.out.print("x>z>y");
        }
        if((y>x)&&(y>z)){
            if (x>z) System.out.print("y>x>z");
            else System.out.print("y>z>x");
        }
        if((z>y)&&(z>x)){
            if (y>x) System.out.print("z>y>x");
            else System.out.print("z>x>y");
        }

    }
}
