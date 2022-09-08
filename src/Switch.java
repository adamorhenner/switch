

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Switch implements Host{

    private ArrayList<SwitchPort> ports = new ArrayList();

    private Set<RegistroMac> tabelaMacs = new HashSet<RegistroMac>();

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

    public void receberPacote(Package package1) {
        this.registrarTabelaMac(SwitchPort switchPort,package1.getMacOrigin());
        this.sendPackage(package1);
    }

    public void sendPackage(Package package1) {
        SwitchPort port = getPortByMacIp(package1.getIpDestiny());
        port.receberPacote(package1);
    }

    @Override
    public Boolean getItsMe(String ip) {
        for(SwitchPort port:ports){

        }
        return null;
    }

    private SwitchPort getPortByMacAdress(String macAdress) {
        for (RegistroMac registroMac : tabelaMacs){
            if (registroMac.getMacAdress().equals(macAdress)){
                return registroMac.get;
            }
        }
        return null;
    }

    private void registrarTabelaMac(SwitchPort switchPort, String macOrigin) {
        RegistroMac registroMac = new RegistroMac(switchPort,macOrigin);
        this.tabelaMacs.add(registroMac);
    }
}
