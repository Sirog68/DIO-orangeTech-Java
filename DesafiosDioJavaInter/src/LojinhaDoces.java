import java.util.Scanner;

public class LojinhaDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();

        int doce = dinheiro * 2;

        System.out.println("O cliente obteve " + doce + " doces");

        leitor.close();
    }
    
}
