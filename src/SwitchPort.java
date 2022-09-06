

public class SwitchPort extends Host{

    private Integer port;

    private Host host;

    public SwitchPort(Integer port, Host host) {
        this.port = port;
        this.host = host;
    }

    @Override
    public void getPackage() {

    }

    @Override
    public void sendPackage(Package package1) {

    }
}
