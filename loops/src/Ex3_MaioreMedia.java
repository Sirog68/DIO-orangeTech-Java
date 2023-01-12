import java.util.Scanner;

/*Faça um programa que leia 5 números e informe
 * o maior número e a média desses números.
 */


public class Ex3_MaioreMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        int soma = 0;
        int count =0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            count ++;
        } while (count < 5);

        System.out.println("Maior número digitado: " + maior);
        System.out.println("A soma dos numeros digitados foi: " + soma);
        System.out.println("A média dos números digitados foi: " + (soma/5));

        scan.close();
    }
}
