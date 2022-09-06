
public class Main {


    public static void main(String[] args) {

        Rede rede = new Rede();

        String IP_HOST_1 = "123.456";
        String IP_HOST_2 = "123.654";

        String MAC_ADRESS_H1 = "h1";
        String MAC_ADRESS_H2 = "h2";


        Computador host1 = new Computador(IP_HOST_1, MAC_ADRESS_H1);
        Computador host2 = new Computador(IP_HOST_2, MAC_ADRESS_H2);

        Switch switch1 = new Switch();

        Conect conectHost1 = criarConexao(switch1, host1);
        switch1 = conectHost1.getaSwitch();
        host1 = conectHost1.getComputador();


        Conect conectHost2 = criarConexao(switch1, host2);
        switch1 = conectHost2.getaSwitch();
        host2 = conectHost2.getComputador();

        host1.sendMessage("oi",IP_HOST_2);



    }


    public static Conect criarConexao(Switch aSwitch, Computador host){
        return new Conect(aSwitch,host);
    }

}
