
import java.util.ArrayList;

public class Computador extends Host{

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
    public void getPackage() {

    }

    @Override
    public void sendPackage(Package package1) {

    }


    public void sendMessage(String message, String hostIp) {
        String ipOrigin = this.Ip;
        String ipDestiny = hostIp;
        String macOrigin = this.MacAdress;
        String macDestiny = this.getMacDestiny();
        String payload = message;


        Package package1 = new Package(ipOrigin, ipDestiny,macOrigin, macDestiny, payload);
        this.aSwitch.receber(package1);

    }

    private String getMacDestiny() {

        return null;
    }
}
