import java.util.Scanner;
import java.util.Locale;


public class sobreMim {
    public static void main(String[] args) {
        //criando scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Sigite seu sobrenome: ");
        String lastName = scanner.next();

        System.out.println("Digite su idade : ");
        int age = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double height = scanner.nextDouble();

        //imprimindo dados
        System.out.println("Seu nome é: " + name + " " + lastName + " e tem " + age + " anos e pesa " + height + " quilos.");
    }
}
