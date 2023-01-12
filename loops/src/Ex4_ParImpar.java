import java.util.Scanner;

/*Faça um programa que peça N números interios,
 * calcule e mostre a quantidade de números pares e a 
 * quantidade de números impares.
 */

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNum;
        int numero;
        int quantPares = 0, quantImpar = 0;

        System.out.println("Quantidade de números: ");
        quantNum = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares ++;
            else quantImpar++;

            count ++;
        } while (count < quantNum);

        System.out.println("Quantidade pares: " + quantPares);
        System.out.println("Quantidade Impares: " + quantImpar);

        scan.close();
    }
}
