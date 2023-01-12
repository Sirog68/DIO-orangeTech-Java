import java.util.Scanner;


/* Faça um programa que calcule o fatoria de um numero interio fornecido
 * pelo usuário.
 * 
 * ex.: 5!= 120 (5 * 4 * 3 * 2 * 1)
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número para fatorar: ");
        int fatorial = scan.nextInt();

        int multiplicação = 1;

        for (int i = fatorial; i >= 1; i--) {
            multiplicação = multiplicação * i;
            
        }
        
        System.out.println(fatorial + "! = " + multiplicação);





        scan.close();
    }
}
