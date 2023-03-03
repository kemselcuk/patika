import java.util.Scanner;
public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        n = sc.nextInt();
        for (i =4,j=5; i<n&&j<n;i*=4,j*=5){
            System.out.println(i);
            System.out.println(j);
        }
    }
}
