public class Main {

    public static void main(String[] args) {

        String IP_HOST_1 = "123.456";
        String IP_HOST_2 = "123.654";

        String MAC_ADRESS_H1 = "h1";
        String MAC_ADRESS_H2 = "h2";


        Computador host1 = new Computador(IP_HOST_1,MAC_ADRESS_H1);
        Computador host2 = new Computador(IP_HOST_2, MAC_ADRESS_H2);

        Switch switch1 = new Switch();
        switch1.addHost(1,host1);
        switch1.addHost(2,host2);

        host1.sendMessage("oi", IP_HOST_2);


    }
}
