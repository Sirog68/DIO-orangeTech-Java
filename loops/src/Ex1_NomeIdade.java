import java.util.Scanner;

/*Faça um programa que leia conjuntos de dois valores,
 * O primeiro representando o nome e o segundo a idade.
 * (O program deve parar quando inserido o valor 0.)
*/

public class Ex1_NomeIdade {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;
        
        while(true){
            //Entrada do nome
            System.out.println("Nome : ");
            nome = scan.next();
            if (nome.equals("0")) break;
            //Entrada idade
            System.out.println("Idade: ");
            idade = scan.nextInt();
            
        }
        scan.close();
    }
}
