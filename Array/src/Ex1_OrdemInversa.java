/*
 * crie um vetor de 6 nḿeros interios
 * e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) throws Exception {
        
        int[] vetor = {-5, -8, 15, 50 , 8 ,4};
        //System.out.println("tamanho do vetor : " + vetor.length);

        System.out.println("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor na ordem inversa: \n");
        for (int i = (vetor.length-1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
