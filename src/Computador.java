
import java.util.ArrayList;

public class Computador implements Host{

    String Ip;

    String MacAdress;

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

    public ArrayList<RegistroMac> getRegistroMac() {
        return registroMac;
    }

    public void setRegistroMac(ArrayList<RegistroMac> registroMac) {
        this.registroMac = registroMac;
    }

    private ArrayList<RegistroMac> registroMac = new ArrayList();

    private Switch aSwitch;

    public Computador(String ip, String macAdress) {
        super(ip, macAdress);
    }

    public ArrayList<RegistroMac> getTableMac() {
        return registroMac;
    }

    public void setTableMac(ArrayList<RegistroMac> registroMac) {
        this.registroMac = registroMac;
    }

    public Switch getaSwitch() {
        return aSwitch;
    }

    public void setaSwitch(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public void receberPacote(Package aPackage) {

    }

    @Override
    public void sendPackage(Package package1) {
        this.aSwitch.receberPacote(package1);
    }

    @Override
    public Boolean getItsMe(String ip) {
        return null;
    }

    public void sendMessage(String message, String hostIp) {
        String ipOrigin = this.Ip;
        String ipDestiny = hostIp;
        String macOrigin = this.MacAdress;
        String macDestiny = this.getMacDestiny();
        String payload = message;

        Package package1 = new Package(ipOrigin, ipDestiny,macOrigin, macDestiny, payload);
        this.sendPackage(package1);

    }

    private String getMacDestiny() {

        return null;
    }
}
