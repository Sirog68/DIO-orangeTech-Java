package Polimorfismo;

class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        //UPCAST

        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        //DOWNCAST

        //Gerente gerente_ = new Funcionario();
        //Vendedor vendedor_ = (Vendedor) new Funcionario();
        /*
         *Gera erro um dos motivos para que se use Downcast

         * Exception in thread "main" java.lang.ClassCastException: 
         * class PolimorfismoSobrescrita.Funcionario cannot be cast to class PolimorfismoSobrescrita.Vendedor
         */
    }
}
