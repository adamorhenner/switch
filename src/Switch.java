import java.util.ArrayList;

public class Switch extends Host {

    private ArrayList<SwitchPort> ports = new ArrayList();


    @Override
    public void getPackage() {

    }

    @Override
    public void sendPackage(Package package1) {

    }


    public void addHost(Integer portNumber,Host host1) {
        SwitchPort port1 = new SwitchPort(portNumber,host1);
        this.ports.add(port1);
    }
}
