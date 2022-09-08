

public class SwitchPort implements Host{

    private Integer port;

    private Host host;

    private String adressMac;

    public SwitchPort(Integer port, Host host) {
        this.port = port;
        this.host = host;
    }

    @Override
    public void receberPacote(Package aPackage) {

    }

    @Override
    public void sendPackage(Package package1) {

    }

    @Override
    public Boolean getItsMe(String ip) {
        return null;
    }

    @Override
    public Object getThis() {
        return this;
    }

}
