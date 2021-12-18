import java.util.Scanner;

public class HipotenüsHesaplama {
    public static void main(String[] args) {
        int a , b ;
        double c;
        Scanner girdi = new Scanner(System.in);

        System.out.print("A Değerini Giriniz : ");
        a = girdi.nextInt();

        System.out.print("B Değerini Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs : " + c );

    }

}
