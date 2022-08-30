import java.util.ArrayList;

public class Switch extends Host {

    private ArrayList<SwitchPort> ports = new ArrayList();

    private Integer qtdPorts;

    public Switch(Integer qtdPorts) {
        this.qtdPorts = qtdPorts;
    }

    public Switch() {
        this.qtdPorts = 10;
    }

    @Override
    public void getPackage() {

    }

    @Override
    public void sendPackage(Package package1) {

    }


    public void addHost(Host host1) {
        Integer qntPorts = this.ports.size();
        if (qntPorts >= this.qtdPorts){
            System.out.println("Quantidade Maxima de portas Conectadas");
        } else {
            qntPorts = qntPorts + 1;
            SwitchPort port1 = new SwitchPort(qntPorts, host1);
            this.ports.add(port1);
        }
    }
}
