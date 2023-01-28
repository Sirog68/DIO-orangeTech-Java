import java.util.Scanner;

/*Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informe de qual numero ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 * 
 * Tabuada do 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 * 
 */

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Qual a tabuada deseja: ");
        tabuada = scan.nextInt();


        System.out.println("Tabuada do : " + tabuada);

        for (int i = 0; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
        
        scan.close();
    }
}
