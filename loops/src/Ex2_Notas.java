import java.util.Scanner;

/*
 * Faça um programa que peça uma nota entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo.
 * Até que o usuário informe um valor válido.
 */

 /**
  * Ex2_Notas
  */
 public class Ex2_Notas {
    public static void main(String[] args) {
        int nota;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        nota = scan.nextInt();
        
        while(nota > 10 || nota<0){
        
            System.out.println("Nota inválida! Digite uma nota válida: ");
            nota = scan.nextInt();
        
        }
        scan.close();
    }
    
 }