import java.util.Scanner;

public class LeituraGertrudes {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int paginas = leitor.nextInt();
            int paginasLidas = 3;


            int dia = paginas / paginasLidas;

            System.out.println(dia + " dias");


            // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros
            leitor.close();
        }
        
}
