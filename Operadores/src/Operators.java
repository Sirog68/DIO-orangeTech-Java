public class Operators {
    public static void main(String[] args)  {
       boolean condicao1 = true;
       boolean condicao2 = false;
       
       if(condicao1 && condicao2){
        System.out.println("O dois valores precisão ser verdadeiros!");
       }

       if(condicao1 || condicao2){
        System.out.println("Uma das condições têm de ser verdadeira!");
       }

       if(condicao1 && (7>4)){
        System.out.println("As duas condições atendem a validação!");
       }
    
        System.out.println("Fim");
    }
}
