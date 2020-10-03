

public class Main {

    public static void main(String[] args){

        CelularAndroid victorHugo = new CelularAndroid();
        CelularAndroid diegoBandeira = new CelularAndroid();
        CelularIOS anaPaula = new CelularIOS();
        CelularIOS aguida = new CelularIOS();

        Unipe posEngenharia = new Unipe();
        posEngenharia.registrar(victorHugo);
        posEngenharia.registrar(anaPaula);
        posEngenharia.setMensagem("Aula no sábado iniciada");
        System.out.println("===============");
        posEngenharia.registrar(aguida);
        posEngenharia.registrar(diegoBandeira);
        posEngenharia.setMensagem("Aula no sábado a tarde");
    }

}
