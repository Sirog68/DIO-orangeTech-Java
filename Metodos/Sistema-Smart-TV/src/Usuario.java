public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada : " + smartTv.ligada);
        System.out.println("tv no canal: " + smartTv.canal);
        System.out.println("Tv no volume: " + smartTv.volume);

        //ligando e desligando tv
        smartTv.ligar();
        System.out.println("TV ligada : " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("TV ligada : " + smartTv.ligada);
        
        //aumentando e diminuindo volume
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        //trocando canal
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        //ir para o canal
        smartTv.mudarCanal(25);

    }
}
