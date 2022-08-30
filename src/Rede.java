import java.util.ArrayList;

public class Rede {

    private ArrayList<Computador> computadores = new ArrayList();

    private ArrayList<Switch> switches = new ArrayList();


    public void createConnect(Switch switche, Computador computador){
        switche.addHost(computador);
        computador.setaSwitch(switche);
    }

    public void receive(Package aPackage){
        Computador computador = null;
        computador = this.getComputadorByIp(aPackage.getIpOrigin());

        if (computador.getaSwitch() != null){

        }

    }

    private Computador getComputadorByIp(String ip) {
        for (Computador computador1:this.computadores) {
            if(computador1.getIp().equals(ip)){
                return computador1;
            }
        }
        return null;
    }

}
