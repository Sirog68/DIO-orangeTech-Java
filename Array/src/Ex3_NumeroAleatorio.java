import java.util.Random;

/*Faça um programa que leia 20 numeros aleatório (entre 0 e 100) armazene-os num vetor.
 * Ao fpinal mostre os números e seus sucesssores.
 */

public class Ex3_NumeroAleatorio {
    public static void main(String[] args) {
        Random randon = new Random();

        int[] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length; i++) {
            int numero = randon.nextInt(100);
            numAleatorios[i] = numero;
        }

        System.out.println("\nNumeros aletorios: ");
        for (int numero : numAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores do numeros aleatorios: ");
        for (int numero : numAleatorios) {
            System.out.print((numero + 1) + " ");
        }

        System.out.println("\nAntecessores do numeros aleatorios: ");
        for (int numero : numAleatorios) {
            System.out.print((numero - 1) + " ");
        }
    }
}
