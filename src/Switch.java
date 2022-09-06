

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Switch {

    private ArrayList<SwitchPort> ports = new ArrayList();

    private Set<RegistroMac> tabelaMac = new HashSet<RegistroMac>();

    private Integer qtdPorts;

    public Switch(Integer qtdPorts) {
        this.qtdPorts = qtdPorts;
    }

    public Switch() {
        this.qtdPorts = 10;
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

    public void receber(Package package1) {
        this.registrarTabelaMac(package1.getIpOrigin(),package1.getMacOrigin());
        this.enviar(package1);
    }

    private void enviar(Package package1) {
        
    }

    private void registrarTabelaMac(String ipOrigin, String macOrigin) {
        RegistroMac registroMac = new RegistroMac(ipOrigin,macOrigin);
        this.tabelaMac.add(registroMac);
    }
}
