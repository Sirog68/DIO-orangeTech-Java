public class Main {
    public static void main(String[] args) {
        
        //calculadora
        System.out.println("Exercicio calculadora\n");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(9, 8);
        Calculadora.divisao(5, 2.5);


        //mensagem
        System.out.println("\nMensagem\n");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(0);
        Mensagem.obterMensagem(24);


        //Emprestimo
        System.out.println("\nEmprestimo\n");
        Emprestimo.calcular(1000.00, 2);
        Emprestimo.calcular(1000.00, Emprestimo.getDuasParcelas()); // resulta na solicitação acima
        Emprestimo.calcular(1000.00, 3);
        Emprestimo.calcular(1000.00, Emprestimo.getTresParcelas()); // reulta na solicitação acima
        Emprestimo.calcular(1000.00, 5);
    }
}
