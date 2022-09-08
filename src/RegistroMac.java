
import java.util.Objects;

public class RegistroMac {

    SwitchPort switchPort;

    String MacAdress;

    public RegistroMac(SwitchPort switchPort, String macAdress) {
        this.switchPort = switchPort;
        MacAdress = macAdress;
    }

    public SwitchPort getSwitchPort() {
        return switchPort;
    }

    public void setSwitchPort(SwitchPort switchPort) {
        this.switchPort = switchPort;
    }

    public String getMacAdress() {
        return MacAdress;
    }

    public void setMacAdress(String macAdress) {
        MacAdress = macAdress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistroMac)) return false;
        RegistroMac that = (RegistroMac) o;
        return getSwitchPort().equals(that.getSwitchPort()) && getMacAdress().equals(that.getMacAdress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSwitchPort(), getMacAdress());
    }
}
