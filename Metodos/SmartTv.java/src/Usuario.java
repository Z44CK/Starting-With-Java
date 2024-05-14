public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(14);
        System.out.println("Canal Atual : " +smartTv.canal);

        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("Tv ligada : " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
        
        smartTv.mudarCanal(4);
        System.out.println("Canal Atual : " +smartTv.canal);

        smartTv.ligar();
        System.out.println("Status Atual - Tv ligada ? " + smartTv.ligada);
    }   
}
