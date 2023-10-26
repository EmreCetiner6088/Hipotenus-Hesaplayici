import java.util.Scanner;

public class Calculate {
    double birincikenar;
    double ikincikenar;
    double hipotenus;
    Scanner scanner;
    Math math;
    public void calculateHipotenus() {
        scanner = new Scanner(System.in);
        System.out.println("1. Kenarınızı Giriniz...");
        birincikenar = scanner.nextDouble();
        System.out.println("2. Kenarınızı Giriniz...");
        ikincikenar = scanner.nextDouble();

        hipotenus = Math.sqrt((birincikenar*birincikenar)+(ikincikenar*ikincikenar));
        System.out.println("Hipotenüs Değeriniz : "+hipotenus);


    }

}
