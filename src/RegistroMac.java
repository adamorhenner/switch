
import java.util.Objects;

public class RegistroMac {

    String Ip;

    String MacAdress;

    public RegistroMac(String ip, String macAdress) {
        Ip = ip;
        MacAdress = macAdress;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
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
        return getIp().equals(that.getIp()) && getMacAdress().equals(that.getMacAdress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIp(), getMacAdress());
    }
}
