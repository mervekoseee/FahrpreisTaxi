import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, ucret, sonuc;
        System.out.println("Kat edilen Km'yi yazınız: ");
        km = input.nextDouble();
        ucret = km * 2.20;
        System.out.println("Tutar: " + ucret);
        sonuc = (ucret > 20.0) ? ucret: 20;
        System.out.println("Son Tutar: " + sonuc);

    }
}